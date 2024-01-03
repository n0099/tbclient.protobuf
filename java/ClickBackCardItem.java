package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class ClickBackCardItem extends Message {
    public static final Long DEFAULT_BUSINESS_ID = 0L;
    public static final String DEFAULT_BUSINESS_TYPE = "";
    public static final String DEFAULT_JUMP_URL = "";
    public static final String DEFAULT_TEXT = "";
    @ProtoField(tag = 3, type = Message.Datatype.INT64)
    public final Long business_id;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String business_type;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String jump_url;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String text;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<ClickBackCardItem> {
        public Long business_id;
        public String business_type;
        public String jump_url;
        public String text;

        public Builder() {
        }

        public Builder(ClickBackCardItem clickBackCardItem) {
            super(clickBackCardItem);
            if (clickBackCardItem == null) {
                return;
            }
            this.text = clickBackCardItem.text;
            this.jump_url = clickBackCardItem.jump_url;
            this.business_id = clickBackCardItem.business_id;
            this.business_type = clickBackCardItem.business_type;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ClickBackCardItem build(boolean z) {
            return new ClickBackCardItem(this, z);
        }
    }

    public ClickBackCardItem(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.text;
            if (str == null) {
                this.text = "";
            } else {
                this.text = str;
            }
            String str2 = builder.jump_url;
            if (str2 == null) {
                this.jump_url = "";
            } else {
                this.jump_url = str2;
            }
            Long l = builder.business_id;
            if (l == null) {
                this.business_id = DEFAULT_BUSINESS_ID;
            } else {
                this.business_id = l;
            }
            String str3 = builder.business_type;
            if (str3 == null) {
                this.business_type = "";
                return;
            } else {
                this.business_type = str3;
                return;
            }
        }
        this.text = builder.text;
        this.jump_url = builder.jump_url;
        this.business_id = builder.business_id;
        this.business_type = builder.business_type;
    }
}
