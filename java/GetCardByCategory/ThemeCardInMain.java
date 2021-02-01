package tbclient.GetCardByCategory;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ThemeCardPropMain;
/* loaded from: classes9.dex */
public final class ThemeCardInMain extends Message {
    public static final String DEFAULT_CARD_CATEGORY = "";
    public static final List<ThemeCardPropMain> DEFAULT_PROPS = Collections.emptyList();
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String card_category;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<ThemeCardPropMain> props;

    private ThemeCardInMain(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.card_category == null) {
                this.card_category = "";
            } else {
                this.card_category = builder.card_category;
            }
            if (builder.props == null) {
                this.props = DEFAULT_PROPS;
                return;
            } else {
                this.props = immutableCopyOf(builder.props);
                return;
            }
        }
        this.card_category = builder.card_category;
        this.props = immutableCopyOf(builder.props);
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<ThemeCardInMain> {
        public String card_category;
        public List<ThemeCardPropMain> props;

        public Builder() {
        }

        public Builder(ThemeCardInMain themeCardInMain) {
            super(themeCardInMain);
            if (themeCardInMain != null) {
                this.card_category = themeCardInMain.card_category;
                this.props = ThemeCardInMain.copyOf(themeCardInMain.props);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ThemeCardInMain build(boolean z) {
            return new ThemeCardInMain(this, z);
        }
    }
}
