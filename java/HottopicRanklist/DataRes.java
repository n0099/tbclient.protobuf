package tbclient.HottopicRanklist;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class DataRes extends Message {
    @ProtoField(tag = 1)
    public final TopicListModule topic_bang;
    @ProtoField(tag = 2)
    public final TopicListModule topic_manual;

    /* synthetic */ DataRes(Builder builder, boolean z, DataRes dataRes) {
        this(builder, z);
    }

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.topic_bang = builder.topic_bang;
            this.topic_manual = builder.topic_manual;
            return;
        }
        this.topic_bang = builder.topic_bang;
        this.topic_manual = builder.topic_manual;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public TopicListModule topic_bang;
        public TopicListModule topic_manual;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.topic_bang = dataRes.topic_bang;
                this.topic_manual = dataRes.topic_manual;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z, null);
        }
    }
}
