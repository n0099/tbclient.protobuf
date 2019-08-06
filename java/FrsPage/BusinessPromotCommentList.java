package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes4.dex */
public final class BusinessPromotCommentList extends Message {
    public static final String DEFAULT_TITLE = "";
    public static final String DEFAULT_USERNAME = "";
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer is_lz;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 3, type = Message.Datatype.INT64)
    public final Long uid;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String username;
    public static final Long DEFAULT_UID = 0L;
    public static final Integer DEFAULT_IS_LZ = 0;

    private BusinessPromotCommentList(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.title == null) {
                this.title = "";
            } else {
                this.title = builder.title;
            }
            if (builder.username == null) {
                this.username = "";
            } else {
                this.username = builder.username;
            }
            if (builder.uid == null) {
                this.uid = DEFAULT_UID;
            } else {
                this.uid = builder.uid;
            }
            if (builder.is_lz == null) {
                this.is_lz = DEFAULT_IS_LZ;
                return;
            } else {
                this.is_lz = builder.is_lz;
                return;
            }
        }
        this.title = builder.title;
        this.username = builder.username;
        this.uid = builder.uid;
        this.is_lz = builder.is_lz;
    }

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<BusinessPromotCommentList> {
        public Integer is_lz;
        public String title;
        public Long uid;
        public String username;

        public Builder() {
        }

        public Builder(BusinessPromotCommentList businessPromotCommentList) {
            super(businessPromotCommentList);
            if (businessPromotCommentList != null) {
                this.title = businessPromotCommentList.title;
                this.username = businessPromotCommentList.username;
                this.uid = businessPromotCommentList.uid;
                this.is_lz = businessPromotCommentList.is_lz;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public BusinessPromotCommentList build(boolean z) {
            return new BusinessPromotCommentList(this, z);
        }
    }
}
