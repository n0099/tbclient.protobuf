package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes16.dex */
public final class ItemPoint extends Message {
    public static final Double DEFAULT_POINT = Double.valueOf(0.0d);
    public static final String DEFAULT_TIME_INTVAL = "";
    @ProtoField(tag = 2, type = Message.Datatype.DOUBLE)
    public final Double point;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String time_intval;

    private ItemPoint(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.time_intval == null) {
                this.time_intval = "";
            } else {
                this.time_intval = builder.time_intval;
            }
            if (builder.point == null) {
                this.point = DEFAULT_POINT;
                return;
            } else {
                this.point = builder.point;
                return;
            }
        }
        this.time_intval = builder.time_intval;
        this.point = builder.point;
    }

    /* loaded from: classes16.dex */
    public static final class Builder extends Message.Builder<ItemPoint> {
        public Double point;
        public String time_intval;

        public Builder() {
        }

        public Builder(ItemPoint itemPoint) {
            super(itemPoint);
            if (itemPoint != null) {
                this.time_intval = itemPoint.time_intval;
                this.point = itemPoint.point;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ItemPoint build(boolean z) {
            return new ItemPoint(this, z);
        }
    }
}
