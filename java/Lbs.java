package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class Lbs extends Message {
    public static final String DEFAULT_DISTANCE = "";
    public static final String DEFAULT_LAT = "";
    public static final String DEFAULT_LNG = "";
    public static final String DEFAULT_NAME = "";
    public static final String DEFAULT_SN = "";
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String distance;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String lat;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String lng;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String name;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String sn;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<Lbs> {
        public String distance;
        public String lat;
        public String lng;
        public String name;
        public String sn;

        public Builder() {
        }

        public Builder(Lbs lbs) {
            super(lbs);
            if (lbs == null) {
                return;
            }
            this.lat = lbs.lat;
            this.lng = lbs.lng;
            this.name = lbs.name;
            this.sn = lbs.sn;
            this.distance = lbs.distance;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Lbs build(boolean z) {
            return new Lbs(this, z);
        }
    }

    public Lbs(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.lat;
            if (str == null) {
                this.lat = "";
            } else {
                this.lat = str;
            }
            String str2 = builder.lng;
            if (str2 == null) {
                this.lng = "";
            } else {
                this.lng = str2;
            }
            String str3 = builder.name;
            if (str3 == null) {
                this.name = "";
            } else {
                this.name = str3;
            }
            String str4 = builder.sn;
            if (str4 == null) {
                this.sn = "";
            } else {
                this.sn = str4;
            }
            String str5 = builder.distance;
            if (str5 == null) {
                this.distance = "";
                return;
            } else {
                this.distance = str5;
                return;
            }
        }
        this.lat = builder.lat;
        this.lng = builder.lng;
        this.name = builder.name;
        this.sn = builder.sn;
        this.distance = builder.distance;
    }
}
