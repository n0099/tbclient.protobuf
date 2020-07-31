package tbclient.HotThread;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes17.dex */
public final class Pic extends Message {
    public static final String DEFAULT_BIG_PIC = "";
    public static final String DEFAULT_SMALL_PIC = "";
    public static final String DEFAULT_WATER_PIC = "";
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String big_pic;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String small_pic;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String water_pic;

    private Pic(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.small_pic == null) {
                this.small_pic = "";
            } else {
                this.small_pic = builder.small_pic;
            }
            if (builder.big_pic == null) {
                this.big_pic = "";
            } else {
                this.big_pic = builder.big_pic;
            }
            if (builder.water_pic == null) {
                this.water_pic = "";
                return;
            } else {
                this.water_pic = builder.water_pic;
                return;
            }
        }
        this.small_pic = builder.small_pic;
        this.big_pic = builder.big_pic;
        this.water_pic = builder.water_pic;
    }

    /* loaded from: classes17.dex */
    public static final class Builder extends Message.Builder<Pic> {
        public String big_pic;
        public String small_pic;
        public String water_pic;

        public Builder() {
        }

        public Builder(Pic pic) {
            super(pic);
            if (pic != null) {
                this.small_pic = pic.small_pic;
                this.big_pic = pic.big_pic;
                this.water_pic = pic.water_pic;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Pic build(boolean z) {
            return new Pic(this, z);
        }
    }
}
