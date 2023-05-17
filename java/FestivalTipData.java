package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class FestivalTipData extends Message {
    public static final String DEFAULT_JUMP_URL = "";
    public static final String DEFAULT_TEXT = "";
    @ProtoField(tag = 3)
    public final ThemeColorInfo background_color;
    @ProtoField(tag = 4)
    public final ThemeColorInfo font_color;
    @ProtoField(tag = 5)
    public final IconUrlInfo icon_url;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String jump_url;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String text;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<FestivalTipData> {
        public ThemeColorInfo background_color;
        public ThemeColorInfo font_color;
        public IconUrlInfo icon_url;
        public String jump_url;
        public String text;

        public Builder() {
        }

        public Builder(FestivalTipData festivalTipData) {
            super(festivalTipData);
            if (festivalTipData == null) {
                return;
            }
            this.text = festivalTipData.text;
            this.jump_url = festivalTipData.jump_url;
            this.background_color = festivalTipData.background_color;
            this.font_color = festivalTipData.font_color;
            this.icon_url = festivalTipData.icon_url;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FestivalTipData build(boolean z) {
            return new FestivalTipData(this, z);
        }
    }

    public FestivalTipData(Builder builder, boolean z) {
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
            this.background_color = builder.background_color;
            this.font_color = builder.font_color;
            this.icon_url = builder.icon_url;
            return;
        }
        this.text = builder.text;
        this.jump_url = builder.jump_url;
        this.background_color = builder.background_color;
        this.font_color = builder.font_color;
        this.icon_url = builder.icon_url;
    }
}
