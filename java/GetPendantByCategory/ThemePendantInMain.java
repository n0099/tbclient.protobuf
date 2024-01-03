package tbclient.GetPendantByCategory;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ThemeBgProp;
/* loaded from: classes2.dex */
public final class ThemePendantInMain extends Message {
    public static final String DEFAULT_PENDANT_CATEGORY = "";
    public static final List<ThemeBgProp> DEFAULT_PROPS = Collections.emptyList();
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String pendant_category;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<ThemeBgProp> props;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<ThemePendantInMain> {
        public String pendant_category;
        public List<ThemeBgProp> props;

        public Builder() {
        }

        public Builder(ThemePendantInMain themePendantInMain) {
            super(themePendantInMain);
            if (themePendantInMain == null) {
                return;
            }
            this.pendant_category = themePendantInMain.pendant_category;
            this.props = Message.copyOf(themePendantInMain.props);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ThemePendantInMain build(boolean z) {
            return new ThemePendantInMain(this, z);
        }
    }

    public ThemePendantInMain(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.pendant_category;
            if (str == null) {
                this.pendant_category = "";
            } else {
                this.pendant_category = str;
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
        this.pendant_category = builder.pendant_category;
        this.props = Message.immutableCopyOf(builder.props);
    }
}
