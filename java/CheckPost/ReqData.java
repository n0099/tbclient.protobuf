package tbclient.CheckPost;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes4.dex */
public final class ReqData extends Message {
    public static final String DEFAULT_FORUMNAME = "";
    public static final Long DEFAULT_PID = 0L;
    public static final Integer DEFAULT_POSTTYPE = 0;
    public static final Long DEFAULT_TID = 0L;
    @ProtoField(tag = 4)
    public final CommonReq common;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String forumName;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long pid;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer postType;
    @ProtoField(tag = 5, type = Message.Datatype.UINT64)
    public final Long tid;

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
            this.common = builder.common;
            if (builder.tid == null) {
                this.tid = DEFAULT_TID;
                return;
            } else {
                this.tid = builder.tid;
                return;
            }
        }
        this.pid = builder.pid;
        this.postType = builder.postType;
        this.forumName = builder.forumName;
        this.common = builder.common;
        this.tid = builder.tid;
    }

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<ReqData> {
        public CommonReq common;
        public String forumName;
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
                this.common = reqData.common;
                this.tid = reqData.tid;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ReqData build(boolean z) {
            return new ReqData(this, z);
        }
    }
}
