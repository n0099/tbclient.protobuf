package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class BawuThrones extends Message {
    public static final String DEFAULT_BAZHU_LEVEL = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String bazhu_level;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer has_send_bcast;
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer newest_bcast_pushuser_cnt;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer newest_bcast_pv;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer total_bcast_cnt;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer total_recommend_num;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer used_bcast_cnt;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer used_recommend_num;
    public static final Integer DEFAULT_TOTAL_RECOMMEND_NUM = 0;
    public static final Integer DEFAULT_USED_RECOMMEND_NUM = 0;
    public static final Integer DEFAULT_USED_BCAST_CNT = 0;
    public static final Integer DEFAULT_TOTAL_BCAST_CNT = 0;
    public static final Integer DEFAULT_NEWEST_BCAST_PV = 0;
    public static final Integer DEFAULT_HAS_SEND_BCAST = 0;
    public static final Integer DEFAULT_NEWEST_BCAST_PUSHUSER_CNT = 0;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<BawuThrones> {
        public String bazhu_level;
        public Integer has_send_bcast;
        public Integer newest_bcast_pushuser_cnt;
        public Integer newest_bcast_pv;
        public Integer total_bcast_cnt;
        public Integer total_recommend_num;
        public Integer used_bcast_cnt;
        public Integer used_recommend_num;

        public Builder() {
        }

        public Builder(BawuThrones bawuThrones) {
            super(bawuThrones);
            if (bawuThrones == null) {
                return;
            }
            this.total_recommend_num = bawuThrones.total_recommend_num;
            this.used_recommend_num = bawuThrones.used_recommend_num;
            this.bazhu_level = bawuThrones.bazhu_level;
            this.used_bcast_cnt = bawuThrones.used_bcast_cnt;
            this.total_bcast_cnt = bawuThrones.total_bcast_cnt;
            this.newest_bcast_pv = bawuThrones.newest_bcast_pv;
            this.has_send_bcast = bawuThrones.has_send_bcast;
            this.newest_bcast_pushuser_cnt = bawuThrones.newest_bcast_pushuser_cnt;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public BawuThrones build(boolean z) {
            return new BawuThrones(this, z);
        }
    }

    public BawuThrones(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.total_recommend_num;
            if (num == null) {
                this.total_recommend_num = DEFAULT_TOTAL_RECOMMEND_NUM;
            } else {
                this.total_recommend_num = num;
            }
            Integer num2 = builder.used_recommend_num;
            if (num2 == null) {
                this.used_recommend_num = DEFAULT_USED_RECOMMEND_NUM;
            } else {
                this.used_recommend_num = num2;
            }
            String str = builder.bazhu_level;
            if (str == null) {
                this.bazhu_level = "";
            } else {
                this.bazhu_level = str;
            }
            Integer num3 = builder.used_bcast_cnt;
            if (num3 == null) {
                this.used_bcast_cnt = DEFAULT_USED_BCAST_CNT;
            } else {
                this.used_bcast_cnt = num3;
            }
            Integer num4 = builder.total_bcast_cnt;
            if (num4 == null) {
                this.total_bcast_cnt = DEFAULT_TOTAL_BCAST_CNT;
            } else {
                this.total_bcast_cnt = num4;
            }
            Integer num5 = builder.newest_bcast_pv;
            if (num5 == null) {
                this.newest_bcast_pv = DEFAULT_NEWEST_BCAST_PV;
            } else {
                this.newest_bcast_pv = num5;
            }
            Integer num6 = builder.has_send_bcast;
            if (num6 == null) {
                this.has_send_bcast = DEFAULT_HAS_SEND_BCAST;
            } else {
                this.has_send_bcast = num6;
            }
            Integer num7 = builder.newest_bcast_pushuser_cnt;
            if (num7 == null) {
                this.newest_bcast_pushuser_cnt = DEFAULT_NEWEST_BCAST_PUSHUSER_CNT;
                return;
            } else {
                this.newest_bcast_pushuser_cnt = num7;
                return;
            }
        }
        this.total_recommend_num = builder.total_recommend_num;
        this.used_recommend_num = builder.used_recommend_num;
        this.bazhu_level = builder.bazhu_level;
        this.used_bcast_cnt = builder.used_bcast_cnt;
        this.total_bcast_cnt = builder.total_bcast_cnt;
        this.newest_bcast_pv = builder.newest_bcast_pv;
        this.has_send_bcast = builder.has_send_bcast;
        this.newest_bcast_pushuser_cnt = builder.newest_bcast_pushuser_cnt;
    }
}
