package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class Rpgoldicon extends Message {
    public static final String DEFAULT_KEY = "";
    public static final String DEFAULT_VALUE = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String key;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String value;

    /* synthetic */ Rpgoldicon(Builder builder, boolean z, Rpgoldicon rpgoldicon) {
        this(builder, z);
    }

    private Rpgoldicon(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.key == null) {
                this.key = "";
            } else {
                this.key = builder.key;
            }
            if (builder.value == null) {
                this.value = "";
                return;
            } else {
                this.value = builder.value;
                return;
            }
        }
        this.key = builder.key;
        this.value = builder.value;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<Rpgoldicon> {
        public String key;
        public String value;

        public Builder() {
        }

        public Builder(Rpgoldicon rpgoldicon) {
            super(rpgoldicon);
            if (rpgoldicon != null) {
                this.key = rpgoldicon.key;
                this.value = rpgoldicon.value;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Rpgoldicon build(boolean z) {
            return new Rpgoldicon(this, z, null);
        }
    }
}
