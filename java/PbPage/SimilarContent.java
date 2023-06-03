package tbclient.PbPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.SimpleForum;
import tbclient.ThreadInfo;
/* loaded from: classes2.dex */
public final class SimilarContent extends Message {
    public static final String DEFAULT_SIMILAR_URL = "";
    @ProtoField(tag = 5)
    public final SimpleForum similar_forum;
    @ProtoField(label = Message.Label.REPEATED, tag = 1, type = Message.Datatype.STRING)
    public final List<String> similar_label_list;
    @ProtoField(tag = 4)
    public final ThreadInfo similar_thread;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String similar_url;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer user_type;
    public static final List<String> DEFAULT_SIMILAR_LABEL_LIST = Collections.emptyList();
    public static final Integer DEFAULT_USER_TYPE = 0;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<SimilarContent> {
        public SimpleForum similar_forum;
        public List<String> similar_label_list;
        public ThreadInfo similar_thread;
        public String similar_url;
        public Integer user_type;

        public Builder() {
        }

        public Builder(SimilarContent similarContent) {
            super(similarContent);
            if (similarContent == null) {
                return;
            }
            this.similar_label_list = Message.copyOf(similarContent.similar_label_list);
            this.similar_url = similarContent.similar_url;
            this.user_type = similarContent.user_type;
            this.similar_thread = similarContent.similar_thread;
            this.similar_forum = similarContent.similar_forum;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SimilarContent build(boolean z) {
            return new SimilarContent(this, z);
        }
    }

    public SimilarContent(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<String> list = builder.similar_label_list;
            if (list == null) {
                this.similar_label_list = DEFAULT_SIMILAR_LABEL_LIST;
            } else {
                this.similar_label_list = Message.immutableCopyOf(list);
            }
            String str = builder.similar_url;
            if (str == null) {
                this.similar_url = "";
            } else {
                this.similar_url = str;
            }
            Integer num = builder.user_type;
            if (num == null) {
                this.user_type = DEFAULT_USER_TYPE;
            } else {
                this.user_type = num;
            }
            this.similar_thread = builder.similar_thread;
            this.similar_forum = builder.similar_forum;
            return;
        }
        this.similar_label_list = Message.immutableCopyOf(builder.similar_label_list);
        this.similar_url = builder.similar_url;
        this.user_type = builder.user_type;
        this.similar_thread = builder.similar_thread;
        this.similar_forum = builder.similar_forum;
    }
}
