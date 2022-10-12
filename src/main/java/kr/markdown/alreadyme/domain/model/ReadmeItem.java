package kr.markdown.alreadyme.domain.model;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Entity
@Getter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ReadmeItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String githubOriginalUrl;

    @Nullable
    @Column(columnDefinition = "MEDIUMTEXT")
    private String readmeText;

    @Nullable
    private String objectUrl;

    @DateTimeFormat
    private LocalDateTime createdTime;

    public void setObjectUrl(String objectUrl) {
        this.objectUrl = objectUrl;
    }

    public void setReadmeText(String readmeText) {
        this.readmeText = readmeText;
    }
}
