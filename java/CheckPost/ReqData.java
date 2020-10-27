package tbclient.CheckPost;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes22.dex */
public final class ReqData extends Message {
    public static final String DEFAULT_FORUMNAME = "";
    public static final String DEFAULT_ORI_UGC_NID = "";
    public static final String DEFAULT_ORI_UGC_TID = "";
    public static final String DEFAULT_ORI_UGC_VID = "";
    @ProtoField(tag = 4)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f5152common;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String forumName;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String ori_ugc_nid;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String ori_ugc_tid;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer ori_ugc_type;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String ori_ugc_vid;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long pid;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer postType;
    @ProtoField(tag = 5, type = Message.Datatype.UINT64)
    public final Long tid;
    public static final Long DEFAULT_PID = 0L;
    public static final Integer DEFAULT_POSTTYPE = 0;
    public static final Long DEFAULT_TID = 0L;
    public static final Integer DEFAULT_ORI_UGC_TYPE = 0;

    private ReqData(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.pid == null) {
                this.pid = DEFAULT_PID;
            } else {
                this.pid = builder.pid;
            }
            if (builder.postType == null) {
                this.postType = DEFAULT_POSTTYPE;
            } else {
                this.postType = builder.postType;
            }
            if (builder.forumName == null) {
                this.forumName = "";
            } else {
                this.forumName = builder.forumName;
            }
            this.f5152common = builder.f5153common;
            if (builder.tid == null) {
                this.tid = DEFAULT_TID;
            } else {
                this.tid = builder.tid;
            }
            if (builder.ori_ugc_type == null) {
                this.ori_ugc_type = DEFAULT_ORI_UGC_TYPE;
            } else {
                this.ori_ugc_type = builder.ori_ugc_type;
            }
            if (builder.ori_ugc_nid == null) {
                this.ori_ugc_nid = "";
            } else {
                this.ori_ugc_nid = builder.ori_ugc_nid;
            }
            if (builder.ori_ugc_vid == null) {
                this.ori_ugc_vid = "";
            } else {
                this.ori_ugc_vid = builder.ori_ugc_vid;
            }
            if (builder.ori_ugc_tid == null) {
                this.ori_ugc_tid = "";
                return;
            } else {
                this.ori_ugc_tid = builder.ori_ugc_tid;
                return;
            }
        }
        this.pid = builder.pid;
        this.postType = builder.postType;
        this.forumName = builder.forumName;
        this.f5152common = builder.f5153common;
        this.tid = builder.tid;
        this.ori_ugc_type = builder.ori_ugc_type;
        this.ori_ugc_nid = builder.ori_ugc_nid;
        this.ori_ugc_vid = builder.ori_ugc_vid;
        this.ori_ugc_tid = builder.ori_ugc_tid;
    }

    /* loaded from: classes22.dex */
    public static final class Builder extends Message.Builder<ReqData> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f5153common;
        public String forumName;
        public String ori_ugc_nid;
        public String ori_ugc_tid;
        public Integer ori_ugc_type;
        public String ori_ugc_vid;
        public Long pid;
        public Integer postType;
        public Long tid;

        public Builder() {
        }

        public Builder(ReqData reqData) {
            super(reqData);
            if (reqData != null) {
                this.pid = reqData.pid;
                this.postType = reqData.postType;
                this.forumName = reqData.forumName;
                this.f5153common = reqData.f5152common;
                this.tid = reqData.tid;
                this.ori_ugc_type = reqData.ori_ugc_type;
                this.ori_ugc_nid = reqData.ori_ugc_nid;
                this.ori_ugc_vid = reqData.ori_ugc_vid;
                this.ori_ugc_tid = reqData.ori_ugc_tid;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ReqData build(boolean z) {
            return new ReqData(this, z);
        }
    }
}
