package tbclient.TalkBall;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class Country extends Message {
    public static final String DEFAULT_ICON = "";
    public static final String DEFAULT_NAME = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String icon;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String name;

    private Country(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.icon == null) {
                this.icon = "";
            } else {
                this.icon = builder.icon;
            }
            if (builder.name == null) {
                this.name = "";
                return;
            } else {
                this.name = builder.name;
                return;
            }
        }
        this.icon = builder.icon;
        this.name = builder.name;
    }

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<Country> {
        public String icon;
        public String name;

        public Builder() {
        }

        public Builder(Country country) {
            super(country);
            if (country != null) {
                this.icon = country.icon;
                this.name = country.name;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Country build(boolean z) {
            return new Country(this, z);
        }
    }
}
