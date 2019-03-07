package tbclient.PbFloor;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes4.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_ST_TYPE = "";
    @ProtoField(tag = 9)
    public final CommonReq common;
    @ProtoField(tag = 10, type = Message.Datatype.INT32)
    public final Integer is_comm_reverse;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long kz;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long pid;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer pn;
    @ProtoField(tag = 7, type = Message.Datatype.DOUBLE)
    public final Double scr_dip;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer scr_h;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer scr_w;
    @ProtoField(tag = 3, type = Message.Datatype.INT64)
    public final Long spid;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String st_type;
    public static final Long DEFAULT_KZ = 0L;
    public static final Long DEFAULT_PID = 0L;
    public static final Long DEFAULT_SPID = 0L;
    public static final Integer DEFAULT_PN = 0;
    public static final Integer DEFAULT_SCR_W = 0;
    public static final Integer DEFAULT_SCR_H = 0;
    public static final Double DEFAULT_SCR_DIP = Double.valueOf(0.0d);
    public static final Integer DEFAULT_IS_COMM_REVERSE = 0;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.kz == null) {
                this.kz = DEFAULT_KZ;
            } else {
                this.kz = builder.kz;
            }
            if (builder.pid == null) {
                this.pid = DEFAULT_PID;
            } else {
                this.pid = builder.pid;
            }
            if (builder.spid == null) {
                this.spid = DEFAULT_SPID;
            } else {
                this.spid = builder.spid;
            }
            if (builder.pn == null) {
                this.pn = DEFAULT_PN;
            } else {
                this.pn = builder.pn;
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
            if (builder.st_type == null) {
                this.st_type = "";
            } else {
                this.st_type = builder.st_type;
            }
            this.common = builder.common;
            if (builder.is_comm_reverse == null) {
                this.is_comm_reverse = DEFAULT_IS_COMM_REVERSE;
                return;
            } else {
                this.is_comm_reverse = builder.is_comm_reverse;
                return;
            }
        }
        this.kz = builder.kz;
        this.pid = builder.pid;
        this.spid = builder.spid;
        this.pn = builder.pn;
        this.scr_w = builder.scr_w;
        this.scr_h = builder.scr_h;
        this.scr_dip = builder.scr_dip;
        this.st_type = builder.st_type;
        this.common = builder.common;
        this.is_comm_reverse = builder.is_comm_reverse;
    }

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public CommonReq common;
        public Integer is_comm_reverse;
        public Long kz;
        public Long pid;
        public Integer pn;
        public Double scr_dip;
        public Integer scr_h;
        public Integer scr_w;
        public Long spid;
        public String st_type;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.kz = dataReq.kz;
                this.pid = dataReq.pid;
                this.spid = dataReq.spid;
                this.pn = dataReq.pn;
                this.scr_w = dataReq.scr_w;
                this.scr_h = dataReq.scr_h;
                this.scr_dip = dataReq.scr_dip;
                this.st_type = dataReq.st_type;
                this.common = dataReq.common;
                this.is_comm_reverse = dataReq.is_comm_reverse;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}
