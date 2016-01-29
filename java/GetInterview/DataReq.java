package tbclient.GetInterview;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes.dex */
public final class DataReq extends Message {
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer back;
    @ProtoField(tag = 1)
    public final CommonReq common;
    @ProtoField(tag = 13, type = Message.Datatype.INT32)
    public final Integer need_anti;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer need_danmu;
    @ProtoField(tag = 12, type = Message.Datatype.INT32)
    public final Integer need_taskinfo;
    @ProtoField(tag = 11, type = Message.Datatype.INT64)
    public final Long order_id;
    @ProtoField(tag = 10, type = Message.Datatype.INT32)
    public final Integer q_type;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer rn;
    @ProtoField(tag = 9, type = Message.Datatype.DOUBLE)
    public final Double scr_dip;
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer scr_h;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer scr_w;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long task_id;
    @ProtoField(tag = 3, type = Message.Datatype.INT64)
    public final Long thread_id;
    public static final Long DEFAULT_TASK_ID = 0L;
    public static final Long DEFAULT_THREAD_ID = 0L;
    public static final Integer DEFAULT_NEED_DANMU = 0;
    public static final Integer DEFAULT_BACK = 0;
    public static final Integer DEFAULT_RN = 0;
    public static final Integer DEFAULT_SCR_W = 0;
    public static final Integer DEFAULT_SCR_H = 0;
    public static final Double DEFAULT_SCR_DIP = Double.valueOf(0.0d);
    public static final Integer DEFAULT_Q_TYPE = 0;
    public static final Long DEFAULT_ORDER_ID = 0L;
    public static final Integer DEFAULT_NEED_TASKINFO = 0;
    public static final Integer DEFAULT_NEED_ANTI = 0;

    /* synthetic */ DataReq(Builder builder, boolean z, DataReq dataReq) {
        this(builder, z);
    }

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.common = builder.common;
            if (builder.task_id == null) {
                this.task_id = DEFAULT_TASK_ID;
            } else {
                this.task_id = builder.task_id;
            }
            if (builder.thread_id == null) {
                this.thread_id = DEFAULT_THREAD_ID;
            } else {
                this.thread_id = builder.thread_id;
            }
            if (builder.need_danmu == null) {
                this.need_danmu = DEFAULT_NEED_DANMU;
            } else {
                this.need_danmu = builder.need_danmu;
            }
            if (builder.back == null) {
                this.back = DEFAULT_BACK;
            } else {
                this.back = builder.back;
            }
            if (builder.rn == null) {
                this.rn = DEFAULT_RN;
            } else {
                this.rn = builder.rn;
            }
            if (builder.scr_w == null) {
                this.scr_w = DEFAULT_SCR_W;
            } else {
                this.scr_w = builder.scr_w;
            }
            if (builder.scr_h == null) {
                this.scr_h = DEFAULT_SCR_H;
            } else {
                this.scr_h = builder.scr_h;
            }
            if (builder.scr_dip == null) {
                this.scr_dip = DEFAULT_SCR_DIP;
            } else {
                this.scr_dip = builder.scr_dip;
            }
            if (builder.q_type == null) {
                this.q_type = DEFAULT_Q_TYPE;
            } else {
                this.q_type = builder.q_type;
            }
            if (builder.order_id == null) {
                this.order_id = DEFAULT_ORDER_ID;
            } else {
                this.order_id = builder.order_id;
            }
            if (builder.need_taskinfo == null) {
                this.need_taskinfo = DEFAULT_NEED_TASKINFO;
            } else {
                this.need_taskinfo = builder.need_taskinfo;
            }
            if (builder.need_anti == null) {
                this.need_anti = DEFAULT_NEED_ANTI;
                return;
            } else {
                this.need_anti = builder.need_anti;
                return;
            }
        }
        this.common = builder.common;
        this.task_id = builder.task_id;
        this.thread_id = builder.thread_id;
        this.need_danmu = builder.need_danmu;
        this.back = builder.back;
        this.rn = builder.rn;
        this.scr_w = builder.scr_w;
        this.scr_h = builder.scr_h;
        this.scr_dip = builder.scr_dip;
        this.q_type = builder.q_type;
        this.order_id = builder.order_id;
        this.need_taskinfo = builder.need_taskinfo;
        this.need_anti = builder.need_anti;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public Integer back;
        public CommonReq common;
        public Integer need_anti;
        public Integer need_danmu;
        public Integer need_taskinfo;
        public Long order_id;
        public Integer q_type;
        public Integer rn;
        public Double scr_dip;
        public Integer scr_h;
        public Integer scr_w;
        public Long task_id;
        public Long thread_id;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.common = dataReq.common;
                this.task_id = dataReq.task_id;
                this.thread_id = dataReq.thread_id;
                this.need_danmu = dataReq.need_danmu;
                this.back = dataReq.back;
                this.rn = dataReq.rn;
                this.scr_w = dataReq.scr_w;
                this.scr_h = dataReq.scr_h;
                this.scr_dip = dataReq.scr_dip;
                this.q_type = dataReq.q_type;
                this.order_id = dataReq.order_id;
                this.need_taskinfo = dataReq.need_taskinfo;
                this.need_anti = dataReq.need_anti;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z, null);
        }
    }
}
