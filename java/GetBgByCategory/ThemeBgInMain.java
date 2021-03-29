package tbclient.GetBgByCategory;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ThemeBgProp;
/* loaded from: classes7.dex */
public final class ThemeBgInMain extends Message {
    public static final String DEFAULT_BG_CATEGORY = "";
    public static final List<ThemeBgProp> DEFAULT_PROPS = Collections.emptyList();
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String bg_category;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<ThemeBgProp> props;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<ThemeBgInMain> {
        public String bg_category;
        public List<ThemeBgProp> props;

        public Builder() {
        }

        public Builder(ThemeBgInMain themeBgInMain) {
            super(themeBgInMain);
            if (themeBgInMain == null) {
                return;
            }
            this.bg_category = themeBgInMain.bg_category;
            this.props = Message.copyOf(themeBgInMain.props);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ThemeBgInMain build(boolean z) {
            return new ThemeBgInMain(this, z);
        }
    }

    public ThemeBgInMain(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.bg_category;
            if (str == null) {
                this.bg_category = "";
            } else {
                this.bg_category = str;
            }
            List<ThemeBgProp> list = builder.props;
            if (list == null) {
                this.props = DEFAULT_PROPS;
                return;
            } else {
                this.props = Message.immutableCopyOf(list);
                return;
            }
        }
        this.bg_category = builder.bg_category;
        this.props = Message.immutableCopyOf(builder.props);
    }
}
