package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes7.dex */
public final class TwAnchorPKItem extends Message {
    public static final String DEFAULT_FANS_NUM = "";
    public static final String DEFAULT_HEAD_URL = "";
    public static final String DEFAULT_ORDER = "";
    public static final String DEFAULT_USER_NAME = "";
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String fans_num;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String head_url;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String order;
    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long user_id;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String user_name;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer user_sex;
    public static final Long DEFAULT_USER_ID = 0L;
    public static final Integer DEFAULT_USER_SEX = 0;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<TwAnchorPKItem> {
        public String fans_num;
        public String head_url;
        public String order;
        public Long user_id;
        public String user_name;
        public Integer user_sex;

        public Builder() {
        }

        public Builder(TwAnchorPKItem twAnchorPKItem) {
            super(twAnchorPKItem);
            if (twAnchorPKItem == null) {
                return;
            }
            this.order = twAnchorPKItem.order;
            this.user_id = twAnchorPKItem.user_id;
            this.head_url = twAnchorPKItem.head_url;
            this.user_name = twAnchorPKItem.user_name;
            this.fans_num = twAnchorPKItem.fans_num;
            this.user_sex = twAnchorPKItem.user_sex;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TwAnchorPKItem build(boolean z) {
            return new TwAnchorPKItem(this, z);
        }
    }

    public TwAnchorPKItem(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.order;
            if (str == null) {
                this.order = "";
            } else {
                this.order = str;
            }
            Long l = builder.user_id;
            if (l == null) {
                this.user_id = DEFAULT_USER_ID;
            } else {
                this.user_id = l;
            }
            String str2 = builder.head_url;
            if (str2 == null) {
                this.head_url = "";
            } else {
                this.head_url = str2;
            }
            String str3 = builder.user_name;
            if (str3 == null) {
                this.user_name = "";
            } else {
                this.user_name = str3;
            }
            String str4 = builder.fans_num;
            if (str4 == null) {
                this.fans_num = "";
            } else {
                this.fans_num = str4;
            }
            Integer num = builder.user_sex;
            if (num == null) {
                this.user_sex = DEFAULT_USER_SEX;
                return;
            } else {
                this.user_sex = num;
                return;
            }
        }
        this.order = builder.order;
        this.user_id = builder.user_id;
        this.head_url = builder.head_url;
        this.user_name = builder.user_name;
        this.fans_num = builder.fans_num;
        this.user_sex = builder.user_sex;
    }
}
