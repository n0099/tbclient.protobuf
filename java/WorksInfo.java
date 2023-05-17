package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class WorksInfo extends Message {
    public static final Integer DEFAULT_IS_WORKS = 0;
    public static final List<RecomTopicList> DEFAULT_TOPIC_LIST = Collections.emptyList();
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer is_works;
    @ProtoField(tag = 3)
    public final VideoTags tag_list;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<RecomTopicList> topic_list;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<WorksInfo> {
        public Integer is_works;
        public VideoTags tag_list;
        public List<RecomTopicList> topic_list;

        public Builder() {
        }

        public Builder(WorksInfo worksInfo) {
            super(worksInfo);
            if (worksInfo == null) {
                return;
            }
            this.is_works = worksInfo.is_works;
            this.topic_list = Message.copyOf(worksInfo.topic_list);
            this.tag_list = worksInfo.tag_list;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public WorksInfo build(boolean z) {
            return new WorksInfo(this, z);
        }
    }

    public WorksInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.is_works;
            if (num == null) {
                this.is_works = DEFAULT_IS_WORKS;
            } else {
                this.is_works = num;
            }
            List<RecomTopicList> list = builder.topic_list;
            if (list == null) {
                this.topic_list = DEFAULT_TOPIC_LIST;
            } else {
                this.topic_list = Message.immutableCopyOf(list);
            }
            this.tag_list = builder.tag_list;
            return;
        }
        this.is_works = builder.is_works;
        this.topic_list = Message.immutableCopyOf(builder.topic_list);
        this.tag_list = builder.tag_list;
    }
}
