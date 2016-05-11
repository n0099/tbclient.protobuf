package tbclient.Frshighlist;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_DA_IDFA = "";
    public static final String DEFAULT_FORUM_NAME = "";
    public static final String DEFAULT_PLATFORM = "";
    @ProtoField(tag = 1)
    public final CommonReq common;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String da_idfa;
    @ProtoField(tag = 10, type = Message.Datatype.UINT64)
    public final Long forum_id;
    @ProtoField(tag = 13, type = Message.Datatype.STRING)
    public final String forum_name;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer need_abstract;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String platform;
    @ProtoField(tag = 11, type = Message.Datatype.INT32)
    public final Integer pn;
    @ProtoField(tag = 6, type = Message.Datatype.UINT32)
    public final Integer q_type;
    @ProtoField(tag = 12, type = Message.Datatype.DOUBLE)
    public final Double scr_dip;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer scr_h;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer scr_w;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer st_type;
    @ProtoField(tag = 7, type = Message.Datatype.UINT64)
    public final Long user_id;
    public static final Integer DEFAULT_NEED_ABSTRACT = 0;
    public static final Integer DEFAULT_ST_TYPE = 0;
    public static final Integer DEFAULT_SCR_W = 0;
    public static final Integer DEFAULT_SCR_H = 0;
    public static final Integer DEFAULT_Q_TYPE = 0;
    public static final Long DEFAULT_USER_ID = 0L;
    public static final Long DEFAULT_FORUM_ID = 0L;
    public static final Integer DEFAULT_PN = 0;
    public static final Double DEFAULT_SCR_DIP = Double.valueOf(0.0d);

    /* synthetic */ DataReq(Builder builder, boolean z, DataReq dataReq) {
        this(builder, z);
    }

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.common = builder.common;
            if (builder.need_abstract == null) {
                this.need_abstract = DEFAULT_NEED_ABSTRACT;
            } else {
                this.need_abstract = builder.need_abstract;
            }
            if (builder.st_type == null) {
                this.st_type = DEFAULT_ST_TYPE;
            } else {
                this.st_type = builder.st_type;
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
            if (builder.q_type == null) {
                this.q_type = DEFAULT_Q_TYPE;
            } else {
                this.q_type = builder.q_type;
            }
            if (builder.user_id == null) {
                this.user_id = DEFAULT_USER_ID;
            } else {
                this.user_id = builder.user_id;
            }
            if (builder.da_idfa == null) {
                this.da_idfa = "";
            } else {
                this.da_idfa = builder.da_idfa;
            }
            if (builder.platform == null) {
                this.platform = "";
            } else {
                this.platform = builder.platform;
            }
            if (builder.forum_id == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = builder.forum_id;
            }
            if (builder.pn == null) {
                this.pn = DEFAULT_PN;
            } else {
                this.pn = builder.pn;
            }
            if (builder.scr_dip == null) {
                this.scr_dip = DEFAULT_SCR_DIP;
            } else {
                this.scr_dip = builder.scr_dip;
            }
            if (builder.forum_name == null) {
                this.forum_name = "";
                return;
            } else {
                this.forum_name = builder.forum_name;
                return;
            }
        }
        this.common = builder.common;
        this.need_abstract = builder.need_abstract;
        this.st_type = builder.st_type;
        this.scr_w = builder.scr_w;
        this.scr_h = builder.scr_h;
        this.q_type = builder.q_type;
        this.user_id = builder.user_id;
        this.da_idfa = builder.da_idfa;
        this.platform = builder.platform;
        this.forum_id = builder.forum_id;
        this.pn = builder.pn;
        this.scr_dip = builder.scr_dip;
        this.forum_name = builder.forum_name;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public CommonReq common;
        public String da_idfa;
        public Long forum_id;
        public String forum_name;
        public Integer need_abstract;
        public String platform;
        public Integer pn;
        public Integer q_type;
        public Double scr_dip;
        public Integer scr_h;
        public Integer scr_w;
        public Integer st_type;
        public Long user_id;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.common = dataReq.common;
                this.need_abstract = dataReq.need_abstract;
                this.st_type = dataReq.st_type;
                this.scr_w = dataReq.scr_w;
                this.scr_h = dataReq.scr_h;
                this.q_type = dataReq.q_type;
                this.user_id = dataReq.user_id;
                this.da_idfa = dataReq.da_idfa;
                this.platform = dataReq.platform;
                this.forum_id = dataReq.forum_id;
                this.pn = dataReq.pn;
                this.scr_dip = dataReq.scr_dip;
                this.forum_name = dataReq.forum_name;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z, null);
        }
    }
}
