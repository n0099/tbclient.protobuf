package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class NewFloorInfo extends Message {
    public static final List<PbContent> DEFAULT_CONTENT = Collections.emptyList();
    public static final Integer DEFAULT_IS_FLOOR = 0;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<PbContent> content;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer is_floor;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<NewFloorInfo> {
        public List<PbContent> content;
        public Integer is_floor;

        public Builder() {
        }

        public Builder(NewFloorInfo newFloorInfo) {
            super(newFloorInfo);
            if (newFloorInfo == null) {
                return;
            }
            this.content = Message.copyOf(newFloorInfo.content);
            this.is_floor = newFloorInfo.is_floor;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public NewFloorInfo build(boolean z) {
            return new NewFloorInfo(this, z);
        }
    }

    public NewFloorInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<PbContent> list = builder.content;
            if (list == null) {
                this.content = DEFAULT_CONTENT;
            } else {
                this.content = Message.immutableCopyOf(list);
            }
            Integer num = builder.is_floor;
            if (num == null) {
                this.is_floor = DEFAULT_IS_FLOOR;
                return;
            } else {
                this.is_floor = num;
                return;
            }
        }
        this.content = Message.immutableCopyOf(builder.content);
        this.is_floor = builder.is_floor;
    }
}
