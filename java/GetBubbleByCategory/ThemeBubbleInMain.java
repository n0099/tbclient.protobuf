package tbclient.GetBubbleByCategory;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ThemeBgProp;
/* loaded from: classes9.dex */
public final class ThemeBubbleInMain extends Message {
    public static final String DEFAULT_BUBBLE_CATEGORY = "";
    public static final List<ThemeBgProp> DEFAULT_PROPS = Collections.emptyList();
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String bubble_category;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<ThemeBgProp> props;

    private ThemeBubbleInMain(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.bubble_category == null) {
                this.bubble_category = "";
            } else {
                this.bubble_category = builder.bubble_category;
            }
            if (builder.props == null) {
                this.props = DEFAULT_PROPS;
                return;
            } else {
                this.props = immutableCopyOf(builder.props);
                return;
            }
        }
        this.bubble_category = builder.bubble_category;
        this.props = immutableCopyOf(builder.props);
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<ThemeBubbleInMain> {
        public String bubble_category;
        public List<ThemeBgProp> props;

        public Builder() {
        }

        public Builder(ThemeBubbleInMain themeBubbleInMain) {
            super(themeBubbleInMain);
            if (themeBubbleInMain != null) {
                this.bubble_category = themeBubbleInMain.bubble_category;
                this.props = ThemeBubbleInMain.copyOf(themeBubbleInMain.props);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ThemeBubbleInMain build(boolean z) {
            return new ThemeBubbleInMain(this, z);
        }
    }
}
