package tbclient.CheckPost;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class ReqData extends Message {
    public static final String DEFAULT_FORUMNAME = "";
    public static final Long DEFAULT_PID = 0L;
    public static final Integer DEFAULT_POSTTYPE = 0;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String forumName;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long pid;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer postType;

    /* synthetic */ ReqData(Builder builder, boolean z, ReqData reqData) {
        this(builder, z);
    }

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
                return;
            } else {
                this.forumName = builder.forumName;
                return;
            }
        }
        this.pid = builder.pid;
        this.postType = builder.postType;
        this.forumName = builder.forumName;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<ReqData> {
        public String forumName;
        public Long pid;
        public Integer postType;

        public Builder() {
        }

        public Builder(ReqData reqData) {
            super(reqData);
            if (reqData != null) {
                this.pid = reqData.pid;
                this.postType = reqData.postType;
                this.forumName = reqData.forumName;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ReqData build(boolean z) {
            return new ReqData(this, z, null);
        }
    }
}
