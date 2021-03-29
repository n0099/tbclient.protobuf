package tbclient.CheckPost;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes7.dex */
public final class ResData extends Message {
    public static final String DEFAULT_FNAME = "";
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String fname;
    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long forumId;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long postState;
    @ProtoField(tag = 3, type = Message.Datatype.UINT64)
    public final Long quoteId;
    @ProtoField(tag = 4, type = Message.Datatype.UINT64)
    public final Long repostId;
    public static final Long DEFAULT_POSTSTATE = 0L;
    public static final Long DEFAULT_FORUMID = 0L;
    public static final Long DEFAULT_QUOTEID = 0L;
    public static final Long DEFAULT_REPOSTID = 0L;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<ResData> {
        public String fname;
        public Long forumId;
        public Long postState;
        public Long quoteId;
        public Long repostId;

        public Builder() {
        }

        public Builder(ResData resData) {
            super(resData);
            if (resData == null) {
                return;
            }
            this.postState = resData.postState;
            this.forumId = resData.forumId;
            this.quoteId = resData.quoteId;
            this.repostId = resData.repostId;
            this.fname = resData.fname;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ResData build(boolean z) {
            return new ResData(this, z);
        }
    }

    public ResData(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.postState;
            if (l == null) {
                this.postState = DEFAULT_POSTSTATE;
            } else {
                this.postState = l;
            }
            Long l2 = builder.forumId;
            if (l2 == null) {
                this.forumId = DEFAULT_FORUMID;
            } else {
                this.forumId = l2;
            }
            Long l3 = builder.quoteId;
            if (l3 == null) {
                this.quoteId = DEFAULT_QUOTEID;
            } else {
                this.quoteId = l3;
            }
            Long l4 = builder.repostId;
            if (l4 == null) {
                this.repostId = DEFAULT_REPOSTID;
            } else {
                this.repostId = l4;
            }
            String str = builder.fname;
            if (str == null) {
                this.fname = "";
                return;
            } else {
                this.fname = str;
                return;
            }
        }
        this.postState = builder.postState;
        this.forumId = builder.forumId;
        this.quoteId = builder.quoteId;
        this.repostId = builder.repostId;
        this.fname = builder.fname;
    }
}
