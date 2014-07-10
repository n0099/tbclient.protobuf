package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class Lbs extends Message {
    public static final String DEFAULT_LAT = "";
    public static final String DEFAULT_LNG = "";
    public static final String DEFAULT_NAME = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String lat;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String lng;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String name;

    /* synthetic */ Lbs(Builder builder, boolean z, Lbs lbs) {
        this(builder, z);
    }

    private Lbs(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.lat == null) {
                this.lat = "";
            } else {
                this.lat = builder.lat;
            }
            if (builder.lng == null) {
                this.lng = "";
            } else {
                this.lng = builder.lng;
            }
            if (builder.name == null) {
                this.name = "";
                return;
            } else {
                this.name = builder.name;
                return;
            }
        }
        this.lat = builder.lat;
        this.lng = builder.lng;
        this.name = builder.name;
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<Lbs> {
        public String lat;
        public String lng;
        public String name;

        public Builder(Lbs lbs) {
            super(lbs);
            if (lbs != null) {
                this.lat = lbs.lat;
                this.lng = lbs.lng;
                this.name = lbs.name;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Lbs build(boolean z) {
            return new Lbs(this, z, null);
        }
    }
}
