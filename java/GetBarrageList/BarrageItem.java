package tbclient.GetBarrageList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class BarrageItem extends Message {
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<Barrage> list;
    @ProtoField(tag = 1, type = Message.Datatype.DOUBLE)
    public final Double time;
    public static final Double DEFAULT_TIME = Double.valueOf(0.0d);
    public static final List<Barrage> DEFAULT_LIST = Collections.emptyList();

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<BarrageItem> {
        public List<Barrage> list;
        public Double time;

        public Builder() {
        }

        public Builder(BarrageItem barrageItem) {
            super(barrageItem);
            if (barrageItem == null) {
                return;
            }
            this.time = barrageItem.time;
            this.list = Message.copyOf(barrageItem.list);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public BarrageItem build(boolean z) {
            return new BarrageItem(this, z);
        }
    }

    public BarrageItem(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Double d = builder.time;
            if (d == null) {
                this.time = DEFAULT_TIME;
            } else {
                this.time = d;
            }
            List<Barrage> list = builder.list;
            if (list == null) {
                this.list = DEFAULT_LIST;
                return;
            } else {
                this.list = Message.immutableCopyOf(list);
                return;
            }
        }
        this.time = builder.time;
        this.list = Message.immutableCopyOf(builder.list);
    }
}
