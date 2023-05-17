package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class ItemThemeColorElement extends Message {
    public static final String DEFAULT_BOTTOM_COLOR = "";
    public static final String DEFAULT_EDIT_BUTTON_COLOR = "";
    public static final String DEFAULT_TOP_COLOR = "";
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String bottom_color;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String edit_button_color;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String top_color;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<ItemThemeColorElement> {
        public String bottom_color;
        public String edit_button_color;
        public String top_color;

        public Builder() {
        }

        public Builder(ItemThemeColorElement itemThemeColorElement) {
            super(itemThemeColorElement);
            if (itemThemeColorElement == null) {
                return;
            }
            this.top_color = itemThemeColorElement.top_color;
            this.bottom_color = itemThemeColorElement.bottom_color;
            this.edit_button_color = itemThemeColorElement.edit_button_color;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ItemThemeColorElement build(boolean z) {
            return new ItemThemeColorElement(this, z);
        }
    }

    public ItemThemeColorElement(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.top_color;
            if (str == null) {
                this.top_color = "";
            } else {
                this.top_color = str;
            }
            String str2 = builder.bottom_color;
            if (str2 == null) {
                this.bottom_color = "";
            } else {
                this.bottom_color = str2;
            }
            String str3 = builder.edit_button_color;
            if (str3 == null) {
                this.edit_button_color = "";
                return;
            } else {
                this.edit_button_color = str3;
                return;
            }
        }
        this.top_color = builder.top_color;
        this.bottom_color = builder.bottom_color;
        this.edit_button_color = builder.edit_button_color;
    }
}
