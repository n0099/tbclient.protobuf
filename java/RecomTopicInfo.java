package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes9.dex */
public final class RecomTopicInfo extends Message {
    public static final String DEFAULT_RECOM_TITLE = "";
    public static final List<RecomTopicList> DEFAULT_TOPIC_LIST = Collections.emptyList();
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String recom_title;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<RecomTopicList> topic_list;

    private RecomTopicInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.recom_title == null) {
                this.recom_title = "";
            } else {
                this.recom_title = builder.recom_title;
            }
            if (builder.topic_list == null) {
                this.topic_list = DEFAULT_TOPIC_LIST;
                return;
            } else {
                this.topic_list = immutableCopyOf(builder.topic_list);
                return;
            }
        }
        this.recom_title = builder.recom_title;
        this.topic_list = immutableCopyOf(builder.topic_list);
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<RecomTopicInfo> {
        public String recom_title;
        public List<RecomTopicList> topic_list;

        public Builder() {
        }

        public Builder(RecomTopicInfo recomTopicInfo) {
            super(recomTopicInfo);
            if (recomTopicInfo != null) {
                this.recom_title = recomTopicInfo.recom_title;
                this.topic_list = RecomTopicInfo.copyOf(recomTopicInfo.topic_list);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public RecomTopicInfo build(boolean z) {
            return new RecomTopicInfo(this, z);
        }
    }
}
