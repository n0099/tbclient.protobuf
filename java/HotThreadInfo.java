package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class HotThreadInfo extends Message {
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer cid;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer hmtype;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer hot_weight;
    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long post_num;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long thread_id;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer time_type;
    public static final Long DEFAULT_THREAD_ID = 0L;
    public static final Long DEFAULT_POST_NUM = 0L;
    public static final Integer DEFAULT_CID = 0;
    public static final Integer DEFAULT_HMTYPE = 0;
    public static final Integer DEFAULT_TIME_TYPE = 0;
    public static final Integer DEFAULT_HOT_WEIGHT = 0;

    private HotThreadInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.thread_id == null) {
                this.thread_id = DEFAULT_THREAD_ID;
            } else {
                this.thread_id = builder.thread_id;
            }
            if (builder.post_num == null) {
                this.post_num = DEFAULT_POST_NUM;
            } else {
                this.post_num = builder.post_num;
            }
            if (builder.cid == null) {
                this.cid = DEFAULT_CID;
            } else {
                this.cid = builder.cid;
            }
            if (builder.hmtype == null) {
                this.hmtype = DEFAULT_HMTYPE;
            } else {
                this.hmtype = builder.hmtype;
            }
            if (builder.time_type == null) {
                this.time_type = DEFAULT_TIME_TYPE;
            } else {
                this.time_type = builder.time_type;
            }
            if (builder.hot_weight == null) {
                this.hot_weight = DEFAULT_HOT_WEIGHT;
                return;
            } else {
                this.hot_weight = builder.hot_weight;
                return;
            }
        }
        this.thread_id = builder.thread_id;
        this.post_num = builder.post_num;
        this.cid = builder.cid;
        this.hmtype = builder.hmtype;
        this.time_type = builder.time_type;
        this.hot_weight = builder.hot_weight;
    }

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<HotThreadInfo> {
        public Integer cid;
        public Integer hmtype;
        public Integer hot_weight;
        public Long post_num;
        public Long thread_id;
        public Integer time_type;

        public Builder() {
        }

        public Builder(HotThreadInfo hotThreadInfo) {
            super(hotThreadInfo);
            if (hotThreadInfo != null) {
                this.thread_id = hotThreadInfo.thread_id;
                this.post_num = hotThreadInfo.post_num;
                this.cid = hotThreadInfo.cid;
                this.hmtype = hotThreadInfo.hmtype;
                this.time_type = hotThreadInfo.time_type;
                this.hot_weight = hotThreadInfo.hot_weight;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public HotThreadInfo build(boolean z) {
            return new HotThreadInfo(this, z);
        }
    }
}
