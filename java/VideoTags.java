package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class VideoTags extends Message {
    public static final String DEFAULT_FIRST = "";
    public static final String DEFAULT_SECOND = "";
    public static final List<String> DEFAULT_TAGS = Collections.emptyList();
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String first;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String second;
    @ProtoField(label = Message.Label.REPEATED, tag = 3, type = Message.Datatype.STRING)
    public final List<String> tags;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<VideoTags> {
        public String first;
        public String second;
        public List<String> tags;

        public Builder() {
        }

        public Builder(VideoTags videoTags) {
            super(videoTags);
            if (videoTags == null) {
                return;
            }
            this.first = videoTags.first;
            this.second = videoTags.second;
            this.tags = Message.copyOf(videoTags.tags);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public VideoTags build(boolean z) {
            return new VideoTags(this, z);
        }
    }

    public VideoTags(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.first;
            if (str == null) {
                this.first = "";
            } else {
                this.first = str;
            }
            String str2 = builder.second;
            if (str2 == null) {
                this.second = "";
            } else {
                this.second = str2;
            }
            List<String> list = builder.tags;
            if (list == null) {
                this.tags = DEFAULT_TAGS;
                return;
            } else {
                this.tags = Message.immutableCopyOf(list);
                return;
            }
        }
        this.first = builder.first;
        this.second = builder.second;
        this.tags = Message.immutableCopyOf(builder.tags);
    }
}
