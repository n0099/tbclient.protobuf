package tbclient.GetSkinByCategory;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ThemeSkinPropMain;
/* loaded from: classes8.dex */
public final class ThemeSkinInMain extends Message {
    public static final List<ThemeSkinPropMain> DEFAULT_PROPS = Collections.emptyList();
    public static final String DEFAULT_SKIN_CATEGORY = "";
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<ThemeSkinPropMain> props;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String skin_category;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<ThemeSkinInMain> {
        public List<ThemeSkinPropMain> props;
        public String skin_category;

        public Builder() {
        }

        public Builder(ThemeSkinInMain themeSkinInMain) {
            super(themeSkinInMain);
            if (themeSkinInMain == null) {
                return;
            }
            this.skin_category = themeSkinInMain.skin_category;
            this.props = Message.copyOf(themeSkinInMain.props);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ThemeSkinInMain build(boolean z) {
            return new ThemeSkinInMain(this, z);
        }
    }

    public ThemeSkinInMain(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.skin_category;
            if (str == null) {
                this.skin_category = "";
            } else {
                this.skin_category = str;
            }
            List<ThemeSkinPropMain> list = builder.props;
            if (list == null) {
                this.props = DEFAULT_PROPS;
                return;
            } else {
                this.props = Message.immutableCopyOf(list);
                return;
            }
        }
        this.skin_category = builder.skin_category;
        this.props = Message.immutableCopyOf(builder.props);
    }
}
