package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class Rpgoldicon extends Message {
    public static final String DEFAULT_KEY = "";
    public static final String DEFAULT_VALUE = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String key;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String value;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<Rpgoldicon> {
        public String key;
        public String value;

        public Builder() {
        }

        public Builder(Rpgoldicon rpgoldicon) {
            super(rpgoldicon);
            if (rpgoldicon == null) {
                return;
            }
            this.key = rpgoldicon.key;
            this.value = rpgoldicon.value;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Rpgoldicon build(boolean z) {
            return new Rpgoldicon(this, z);
        }
    }

    public Rpgoldicon(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.key;
            if (str == null) {
                this.key = "";
            } else {
                this.key = str;
            }
            String str2 = builder.value;
            if (str2 == null) {
                this.value = "";
                return;
            } else {
                this.value = str2;
                return;
            }
        }
        this.key = builder.key;
        this.value = builder.value;
    }
}
