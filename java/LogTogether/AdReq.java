package tbclient.LogTogether;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class AdReq extends Message {
    public static final String DEFAULT_DA_CPID = "";
    public static final String DEFAULT_DA_EXT_INFO = "";
    public static final String DEFAULT_DA_GOOD_ID = "";
    public static final String DEFAULT_DA_LOCATE = "";
    public static final String DEFAULT_DA_OBJ_ID = "";
    public static final String DEFAULT_DA_PAGE = "";
    public static final String DEFAULT_DA_PLAN_ID = "";
    public static final String DEFAULT_DA_PRICE = "";
    public static final String DEFAULT_DA_TASK = "";
    public static final String DEFAULT_DA_TYPE = "";
    public static final String DEFAULT_DA_USER_ID = "";
    public static final String DEFAULT_DA_VERIFY = "";
    public static final String DEFAULT_EXT = "";
    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public final String da_cpid;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String da_ext_info;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer da_fid;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String da_good_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String da_locate;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String da_obj_id;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String da_page;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String da_plan_id;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String da_price;
    @ProtoField(tag = 14, type = Message.Datatype.STRING)
    public final String da_task;
    @ProtoField(tag = 16, type = Message.Datatype.INT64)
    public final Long da_threadid;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer da_tid;
    @ProtoField(tag = 15, type = Message.Datatype.STRING)
    public final String da_type;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String da_user_id;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String da_verify;
    @ProtoField(tag = 13, type = Message.Datatype.STRING)
    public final String ext;
    public static final Integer DEFAULT_DA_FID = 0;
    public static final Integer DEFAULT_DA_TID = 0;
    public static final Long DEFAULT_DA_THREADID = 0L;

    /* synthetic */ AdReq(Builder builder, boolean z, AdReq adReq) {
        this(builder, z);
    }

    private AdReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.da_page == null) {
                this.da_page = "";
            } else {
                this.da_page = builder.da_page;
            }
            if (builder.da_locate == null) {
                this.da_locate = "";
            } else {
                this.da_locate = builder.da_locate;
            }
            if (builder.da_obj_id == null) {
                this.da_obj_id = "";
            } else {
                this.da_obj_id = builder.da_obj_id;
            }
            if (builder.da_fid == null) {
                this.da_fid = DEFAULT_DA_FID;
            } else {
                this.da_fid = builder.da_fid;
            }
            if (builder.da_tid == null) {
                this.da_tid = DEFAULT_DA_TID;
            } else {
                this.da_tid = builder.da_tid;
            }
            if (builder.da_good_id == null) {
                this.da_good_id = "";
            } else {
                this.da_good_id = builder.da_good_id;
            }
            if (builder.da_ext_info == null) {
                this.da_ext_info = "";
            } else {
                this.da_ext_info = builder.da_ext_info;
            }
            if (builder.da_plan_id == null) {
                this.da_plan_id = "";
            } else {
                this.da_plan_id = builder.da_plan_id;
            }
            if (builder.da_user_id == null) {
                this.da_user_id = "";
            } else {
                this.da_user_id = builder.da_user_id;
            }
            if (builder.da_price == null) {
                this.da_price = "";
            } else {
                this.da_price = builder.da_price;
            }
            if (builder.da_verify == null) {
                this.da_verify = "";
            } else {
                this.da_verify = builder.da_verify;
            }
            if (builder.da_cpid == null) {
                this.da_cpid = "";
            } else {
                this.da_cpid = builder.da_cpid;
            }
            if (builder.ext == null) {
                this.ext = "";
            } else {
                this.ext = builder.ext;
            }
            if (builder.da_task == null) {
                this.da_task = "";
            } else {
                this.da_task = builder.da_task;
            }
            if (builder.da_type == null) {
                this.da_type = "";
            } else {
                this.da_type = builder.da_type;
            }
            if (builder.da_threadid == null) {
                this.da_threadid = DEFAULT_DA_THREADID;
                return;
            } else {
                this.da_threadid = builder.da_threadid;
                return;
            }
        }
        this.da_page = builder.da_page;
        this.da_locate = builder.da_locate;
        this.da_obj_id = builder.da_obj_id;
        this.da_fid = builder.da_fid;
        this.da_tid = builder.da_tid;
        this.da_good_id = builder.da_good_id;
        this.da_ext_info = builder.da_ext_info;
        this.da_plan_id = builder.da_plan_id;
        this.da_user_id = builder.da_user_id;
        this.da_price = builder.da_price;
        this.da_verify = builder.da_verify;
        this.da_cpid = builder.da_cpid;
        this.ext = builder.ext;
        this.da_task = builder.da_task;
        this.da_type = builder.da_type;
        this.da_threadid = builder.da_threadid;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<AdReq> {
        public String da_cpid;
        public String da_ext_info;
        public Integer da_fid;
        public String da_good_id;
        public String da_locate;
        public String da_obj_id;
        public String da_page;
        public String da_plan_id;
        public String da_price;
        public String da_task;
        public Long da_threadid;
        public Integer da_tid;
        public String da_type;
        public String da_user_id;
        public String da_verify;
        public String ext;

        public Builder() {
        }

        public Builder(AdReq adReq) {
            super(adReq);
            if (adReq != null) {
                this.da_page = adReq.da_page;
                this.da_locate = adReq.da_locate;
                this.da_obj_id = adReq.da_obj_id;
                this.da_fid = adReq.da_fid;
                this.da_tid = adReq.da_tid;
                this.da_good_id = adReq.da_good_id;
                this.da_ext_info = adReq.da_ext_info;
                this.da_plan_id = adReq.da_plan_id;
                this.da_user_id = adReq.da_user_id;
                this.da_price = adReq.da_price;
                this.da_verify = adReq.da_verify;
                this.da_cpid = adReq.da_cpid;
                this.ext = adReq.ext;
                this.da_task = adReq.da_task;
                this.da_type = adReq.da_type;
                this.da_threadid = adReq.da_threadid;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AdReq build(boolean z) {
            return new AdReq(this, z, null);
        }
    }
}
