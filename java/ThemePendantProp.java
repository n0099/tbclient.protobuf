package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes4.dex */
public final class ThemePendantProp extends Message {
    public static final Integer DEFAULT_PROPS_ID = 0;
    public static final String DEFAULT_TITLE = "";
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer props_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String title;

    private ThemePendantProp(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.props_id == null) {
                this.props_id = DEFAULT_PROPS_ID;
            } else {
                this.props_id = builder.props_id;
            }
            if (builder.title == null) {
                this.title = "";
                return;
            } else {
                this.title = builder.title;
                return;
            }
        }
        this.props_id = builder.props_id;
        this.title = builder.title;
    }

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<ThemePendantProp> {
        public Integer props_id;
        public String title;

        public Builder() {
        }

        public Builder(ThemePendantProp themePendantProp) {
            super(themePendantProp);
            if (themePendantProp != null) {
                this.props_id = themePendantProp.props_id;
                this.title = themePendantProp.title;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ThemePendantProp build(boolean z) {
            return new ThemePendantProp(this, z);
        }
    }
}
