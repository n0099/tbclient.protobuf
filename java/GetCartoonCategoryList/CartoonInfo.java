package tbclient.GetCartoonCategoryList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class CartoonInfo extends Message {
    public static final String DEFAULT_CARTOON_NAME = "";
    public static final String DEFAULT_COVER_IMG = "";
    public static final String DEFAULT_INTRODUCTION = "";
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long cartoon_id;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String cartoon_name;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String cover_img;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long forum_id;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String introduction;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer is_finish;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer total_chapter;
    public static final Long DEFAULT_FORUM_ID = 0L;
    public static final Long DEFAULT_CARTOON_ID = 0L;
    public static final Integer DEFAULT_IS_FINISH = 0;
    public static final Integer DEFAULT_TOTAL_CHAPTER = 0;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<CartoonInfo> {
        public Long cartoon_id;
        public String cartoon_name;
        public String cover_img;
        public Long forum_id;
        public String introduction;
        public Integer is_finish;
        public Integer total_chapter;

        public Builder() {
        }

        public Builder(CartoonInfo cartoonInfo) {
            super(cartoonInfo);
            if (cartoonInfo == null) {
                return;
            }
            this.forum_id = cartoonInfo.forum_id;
            this.cartoon_id = cartoonInfo.cartoon_id;
            this.cartoon_name = cartoonInfo.cartoon_name;
            this.introduction = cartoonInfo.introduction;
            this.is_finish = cartoonInfo.is_finish;
            this.cover_img = cartoonInfo.cover_img;
            this.total_chapter = cartoonInfo.total_chapter;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public CartoonInfo build(boolean z) {
            return new CartoonInfo(this, z);
        }
    }

    public CartoonInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.forum_id;
            if (l == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = l;
            }
            Long l2 = builder.cartoon_id;
            if (l2 == null) {
                this.cartoon_id = DEFAULT_CARTOON_ID;
            } else {
                this.cartoon_id = l2;
            }
            String str = builder.cartoon_name;
            if (str == null) {
                this.cartoon_name = "";
            } else {
                this.cartoon_name = str;
            }
            String str2 = builder.introduction;
            if (str2 == null) {
                this.introduction = "";
            } else {
                this.introduction = str2;
            }
            Integer num = builder.is_finish;
            if (num == null) {
                this.is_finish = DEFAULT_IS_FINISH;
            } else {
                this.is_finish = num;
            }
            String str3 = builder.cover_img;
            if (str3 == null) {
                this.cover_img = "";
            } else {
                this.cover_img = str3;
            }
            Integer num2 = builder.total_chapter;
            if (num2 == null) {
                this.total_chapter = DEFAULT_TOTAL_CHAPTER;
                return;
            } else {
                this.total_chapter = num2;
                return;
            }
        }
        this.forum_id = builder.forum_id;
        this.cartoon_id = builder.cartoon_id;
        this.cartoon_name = builder.cartoon_name;
        this.introduction = builder.introduction;
        this.is_finish = builder.is_finish;
        this.cover_img = builder.cover_img;
        this.total_chapter = builder.total_chapter;
    }
}
