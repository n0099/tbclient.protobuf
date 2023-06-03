package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
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

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<BusinessPromotCommentList> {
        public Integer is_lz;
        public String title;
        public Long uid;
        public String username;

        public Builder() {
        }

        public Builder(BusinessPromotCommentList businessPromotCommentList) {
            super(businessPromotCommentList);
            if (businessPromotCommentList == null) {
                return;
            }
            this.title = businessPromotCommentList.title;
            this.username = businessPromotCommentList.username;
            this.uid = businessPromotCommentList.uid;
            this.is_lz = businessPromotCommentList.is_lz;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public BusinessPromotCommentList build(boolean z) {
            return new BusinessPromotCommentList(this, z);
        }
    }

    public BusinessPromotCommentList(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            String str2 = builder.username;
            if (str2 == null) {
                this.username = "";
            } else {
                this.username = str2;
            }
            Long l = builder.uid;
            if (l == null) {
                this.uid = DEFAULT_UID;
            } else {
                this.uid = l;
            }
            Integer num = builder.is_lz;
            if (num == null) {
                this.is_lz = DEFAULT_IS_LZ;
                return;
            } else {
                this.is_lz = num;
                return;
            }
        }
        this.title = builder.title;
        this.username = builder.username;
        this.uid = builder.uid;
        this.is_lz = builder.is_lz;
    }
}
