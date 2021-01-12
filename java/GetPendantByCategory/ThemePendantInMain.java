package tbclient.GetPendantByCategory;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ThemeBgProp;
/* loaded from: classes8.dex */
public final class ThemePendantInMain extends Message {
    public static final String DEFAULT_PENDANT_CATEGORY = "";
    public static final List<ThemeBgProp> DEFAULT_PROPS = Collections.emptyList();
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String pendant_category;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<ThemeBgProp> props;

    private ThemePendantInMain(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.pendant_category == null) {
                this.pendant_category = "";
            } else {
                this.pendant_category = builder.pendant_category;
            }
            if (builder.props == null) {
                this.props = DEFAULT_PROPS;
                return;
            } else {
                this.props = immutableCopyOf(builder.props);
                return;
            }
        }
        this.pendant_category = builder.pendant_category;
        this.props = immutableCopyOf(builder.props);
    }

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<ThemePendantInMain> {
        public String pendant_category;
        public List<ThemeBgProp> props;

        public Builder() {
        }

        public Builder(ThemePendantInMain themePendantInMain) {
            super(themePendantInMain);
            if (themePendantInMain != null) {
                this.pendant_category = themePendantInMain.pendant_category;
                this.props = ThemePendantInMain.copyOf(themePendantInMain.props);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ThemePendantInMain build(boolean z) {
            return new ThemePendantInMain(this, z);
        }
    }
}
