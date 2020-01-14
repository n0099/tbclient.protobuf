package tbclient.ThreadList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.AppPosInfo;
import tbclient.CommonReq;
/* loaded from: classes7.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_DA_IDFA = "";
    public static final String DEFAULT_FORUM_NAME = "";
    public static final String DEFAULT_PLATFORM = "";
    public static final String DEFAULT_THREAD_IDS = "";
    @ProtoField(tag = 18)
    public final AdParam ad_param;
    @ProtoField(tag = 17)
    public final AppPosInfo app_pos;
    @ProtoField(tag = 8)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1200common;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String da_idfa;
    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long forum_id;
    @ProtoField(tag = 14, type = Message.Datatype.STRING)
    public final String forum_name;
    @ProtoField(tag = 15, type = Message.Datatype.UINT64)
    public final Long last_click_tid;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer need_abstract;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String platform;
    @ProtoField(tag = 13, type = Message.Datatype.INT32)
    public final Integer pn;
    @ProtoField(tag = 7, type = Message.Datatype.UINT32)
    public final Integer q_type;
    @ProtoField(tag = 12, type = Message.Datatype.DOUBLE)
    public final Double scr_dip;
    @ProtoField(tag = 6, type = Message.Datatype.UINT32)
    public final Integer scr_h;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer scr_w;
    @ProtoField(tag = 16, type = Message.Datatype.INT32)
    public final Integer sort_type;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer st_type;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String thread_ids;
    @ProtoField(tag = 9, type = Message.Datatype.INT64)
    public final Long user_id;
    public static final Long DEFAULT_FORUM_ID = 0L;
    public static final Integer DEFAULT_NEED_ABSTRACT = 0;
    public static final Integer DEFAULT_ST_TYPE = 0;
    public static final Integer DEFAULT_SCR_W = 0;
    public static final Integer DEFAULT_SCR_H = 0;
    public static final Integer DEFAULT_Q_TYPE = 0;
    public static final Long DEFAULT_USER_ID = 0L;
    public static final Double DEFAULT_SCR_DIP = Double.valueOf(0.0d);
    public static final Integer DEFAULT_PN = 0;
    public static final Long DEFAULT_LAST_CLICK_TID = 0L;
    public static final Integer DEFAULT_SORT_TYPE = 0;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.thread_ids == null) {
                this.thread_ids = "";
            } else {
                this.thread_ids = builder.thread_ids;
            }
            if (builder.forum_id == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = builder.forum_id;
            }
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
            this.f1200common = builder.f1201common;
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
            if (builder.scr_dip == null) {
                this.scr_dip = DEFAULT_SCR_DIP;
            } else {
                this.scr_dip = builder.scr_dip;
            }
            if (builder.pn == null) {
                this.pn = DEFAULT_PN;
            } else {
                this.pn = builder.pn;
            }
            if (builder.forum_name == null) {
                this.forum_name = "";
            } else {
                this.forum_name = builder.forum_name;
            }
            if (builder.last_click_tid == null) {
                this.last_click_tid = DEFAULT_LAST_CLICK_TID;
            } else {
                this.last_click_tid = builder.last_click_tid;
            }
            if (builder.sort_type == null) {
                this.sort_type = DEFAULT_SORT_TYPE;
            } else {
                this.sort_type = builder.sort_type;
            }
            this.app_pos = builder.app_pos;
            this.ad_param = builder.ad_param;
            return;
        }
        this.thread_ids = builder.thread_ids;
        this.forum_id = builder.forum_id;
        this.need_abstract = builder.need_abstract;
        this.st_type = builder.st_type;
        this.scr_w = builder.scr_w;
        this.scr_h = builder.scr_h;
        this.q_type = builder.q_type;
        this.f1200common = builder.f1201common;
        this.user_id = builder.user_id;
        this.da_idfa = builder.da_idfa;
        this.platform = builder.platform;
        this.scr_dip = builder.scr_dip;
        this.pn = builder.pn;
        this.forum_name = builder.forum_name;
        this.last_click_tid = builder.last_click_tid;
        this.sort_type = builder.sort_type;
        this.app_pos = builder.app_pos;
        this.ad_param = builder.ad_param;
    }

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public AdParam ad_param;
        public AppPosInfo app_pos;

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1201common;
        public String da_idfa;
        public Long forum_id;
        public String forum_name;
        public Long last_click_tid;
        public Integer need_abstract;
        public String platform;
        public Integer pn;
        public Integer q_type;
        public Double scr_dip;
        public Integer scr_h;
        public Integer scr_w;
        public Integer sort_type;
        public Integer st_type;
        public String thread_ids;
        public Long user_id;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.thread_ids = dataReq.thread_ids;
                this.forum_id = dataReq.forum_id;
                this.need_abstract = dataReq.need_abstract;
                this.st_type = dataReq.st_type;
                this.scr_w = dataReq.scr_w;
                this.scr_h = dataReq.scr_h;
                this.q_type = dataReq.q_type;
                this.f1201common = dataReq.f1200common;
                this.user_id = dataReq.user_id;
                this.da_idfa = dataReq.da_idfa;
                this.platform = dataReq.platform;
                this.scr_dip = dataReq.scr_dip;
                this.pn = dataReq.pn;
                this.forum_name = dataReq.forum_name;
                this.last_click_tid = dataReq.last_click_tid;
                this.sort_type = dataReq.sort_type;
                this.app_pos = dataReq.app_pos;
                this.ad_param = dataReq.ad_param;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}
