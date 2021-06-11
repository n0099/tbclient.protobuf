package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes8.dex */
public final class TwAnchorProfitItem extends Message {
    public static final String DEFAULT_ICON_LOCK_URL = "";
    public static final String DEFAULT_ICON_UNLOCK_URL = "";
    public static final String DEFAULT_NAME = "";
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer available_anchor_level;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String icon_lock_url;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String icon_unlock_url;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer id;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String name;
    public static final Integer DEFAULT_ID = 0;
    public static final Integer DEFAULT_AVAILABLE_ANCHOR_LEVEL = 0;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<TwAnchorProfitItem> {
        public Integer available_anchor_level;
        public String icon_lock_url;
        public String icon_unlock_url;
        public Integer id;
        public String name;

        public Builder() {
        }

        public Builder(TwAnchorProfitItem twAnchorProfitItem) {
            super(twAnchorProfitItem);
            if (twAnchorProfitItem == null) {
                return;
            }
            this.id = twAnchorProfitItem.id;
            this.available_anchor_level = twAnchorProfitItem.available_anchor_level;
            this.name = twAnchorProfitItem.name;
            this.icon_unlock_url = twAnchorProfitItem.icon_unlock_url;
            this.icon_lock_url = twAnchorProfitItem.icon_lock_url;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TwAnchorProfitItem build(boolean z) {
            return new TwAnchorProfitItem(this, z);
        }
    }

    public TwAnchorProfitItem(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.id;
            if (num == null) {
                this.id = DEFAULT_ID;
            } else {
                this.id = num;
            }
            Integer num2 = builder.available_anchor_level;
            if (num2 == null) {
                this.available_anchor_level = DEFAULT_AVAILABLE_ANCHOR_LEVEL;
            } else {
                this.available_anchor_level = num2;
            }
            String str = builder.name;
            if (str == null) {
                this.name = "";
            } else {
                this.name = str;
            }
            String str2 = builder.icon_unlock_url;
            if (str2 == null) {
                this.icon_unlock_url = "";
            } else {
                this.icon_unlock_url = str2;
            }
            String str3 = builder.icon_lock_url;
            if (str3 == null) {
                this.icon_lock_url = "";
                return;
            } else {
                this.icon_lock_url = str3;
                return;
            }
        }
        this.id = builder.id;
        this.available_anchor_level = builder.available_anchor_level;
        this.name = builder.name;
        this.icon_unlock_url = builder.icon_unlock_url;
        this.icon_lock_url = builder.icon_lock_url;
    }
}
