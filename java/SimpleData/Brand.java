package tbclient.SimpleData;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class Brand extends Message {
    public static final String DEFAULT_ICON = "";
    public static final String DEFAULT_NAME = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String icon;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String name;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<Brand> {
        public String icon;
        public String name;

        public Builder() {
        }

        public Builder(Brand brand) {
            super(brand);
            if (brand == null) {
                return;
            }
            this.icon = brand.icon;
            this.name = brand.name;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Brand build(boolean z) {
            return new Brand(this, z);
        }
    }

    public Brand(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.icon;
            if (str == null) {
                this.icon = "";
            } else {
                this.icon = str;
            }
            String str2 = builder.name;
            if (str2 == null) {
                this.name = "";
                return;
            } else {
                this.name = str2;
                return;
            }
        }
        this.icon = builder.icon;
        this.name = builder.name;
    }
}
