package tbclient.GetGiftList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class Category extends Message {
    public static final String DEFAULT_CATEGORY_NAME = "";
    public static final String DEFAULT_GIFT_NAME = "";
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long category_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String category_name;
    @ProtoField(tag = 3, type = Message.Datatype.UINT64)
    public final Long gift_id;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String gift_name;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer in_order;
    @ProtoField(tag = 6, type = Message.Datatype.UINT32)
    public final Integer online_status;
    @ProtoField(tag = 7, type = Message.Datatype.UINT32)
    public final Integer pitch_on;
    public static final Long DEFAULT_CATEGORY_ID = 0L;
    public static final Long DEFAULT_GIFT_ID = 0L;
    public static final Integer DEFAULT_IN_ORDER = 0;
    public static final Integer DEFAULT_ONLINE_STATUS = 0;
    public static final Integer DEFAULT_PITCH_ON = 0;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<Category> {
        public Long category_id;
        public String category_name;
        public Long gift_id;
        public String gift_name;
        public Integer in_order;
        public Integer online_status;
        public Integer pitch_on;

        public Builder() {
        }

        public Builder(Category category) {
            super(category);
            if (category == null) {
                return;
            }
            this.category_id = category.category_id;
            this.category_name = category.category_name;
            this.gift_id = category.gift_id;
            this.gift_name = category.gift_name;
            this.in_order = category.in_order;
            this.online_status = category.online_status;
            this.pitch_on = category.pitch_on;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Category build(boolean z) {
            return new Category(this, z);
        }
    }

    public Category(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.category_id;
            if (l == null) {
                this.category_id = DEFAULT_CATEGORY_ID;
            } else {
                this.category_id = l;
            }
            String str = builder.category_name;
            if (str == null) {
                this.category_name = "";
            } else {
                this.category_name = str;
            }
            Long l2 = builder.gift_id;
            if (l2 == null) {
                this.gift_id = DEFAULT_GIFT_ID;
            } else {
                this.gift_id = l2;
            }
            String str2 = builder.gift_name;
            if (str2 == null) {
                this.gift_name = "";
            } else {
                this.gift_name = str2;
            }
            Integer num = builder.in_order;
            if (num == null) {
                this.in_order = DEFAULT_IN_ORDER;
            } else {
                this.in_order = num;
            }
            Integer num2 = builder.online_status;
            if (num2 == null) {
                this.online_status = DEFAULT_ONLINE_STATUS;
            } else {
                this.online_status = num2;
            }
            Integer num3 = builder.pitch_on;
            if (num3 == null) {
                this.pitch_on = DEFAULT_PITCH_ON;
                return;
            } else {
                this.pitch_on = num3;
                return;
            }
        }
        this.category_id = builder.category_id;
        this.category_name = builder.category_name;
        this.gift_id = builder.gift_id;
        this.gift_name = builder.gift_name;
        this.in_order = builder.in_order;
        this.online_status = builder.online_status;
        this.pitch_on = builder.pitch_on;
    }
}
