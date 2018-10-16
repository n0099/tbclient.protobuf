package tbclient.Userlike;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.ThreadInfo;
/* loaded from: classes6.dex */
public final class ConcernData extends Message {
    public static final Integer DEFAULT_RECOM_TYPE = 0;
    public static final Integer DEFAULT_SOURCE = 0;
    @ProtoField(tag = 2)
    public final PostData post_data;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer recom_type;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer source;
    @ProtoField(tag = 1)
    public final ThreadInfo thread_list;

    private ConcernData(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.thread_list = builder.thread_list;
            this.post_data = builder.post_data;
            if (builder.recom_type == null) {
                this.recom_type = DEFAULT_RECOM_TYPE;
            } else {
                this.recom_type = builder.recom_type;
            }
            if (builder.source == null) {
                this.source = DEFAULT_SOURCE;
                return;
            } else {
                this.source = builder.source;
                return;
            }
        }
        this.thread_list = builder.thread_list;
        this.post_data = builder.post_data;
        this.recom_type = builder.recom_type;
        this.source = builder.source;
    }

    /* loaded from: classes6.dex */
    public static final class Builder extends Message.Builder<ConcernData> {
        public PostData post_data;
        public Integer recom_type;
        public Integer source;
        public ThreadInfo thread_list;

        public Builder() {
        }

        public Builder(ConcernData concernData) {
            super(concernData);
            if (concernData != null) {
                this.thread_list = concernData.thread_list;
                this.post_data = concernData.post_data;
                this.recom_type = concernData.recom_type;
                this.source = concernData.source;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ConcernData build(boolean z) {
            return new ConcernData(this, z);
        }
    }
}
