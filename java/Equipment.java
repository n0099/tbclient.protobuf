package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class Equipment extends Message {
    public static final String DEFAULT_NAME = "";
    public static final String DEFAULT_PORTRAIT = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String name;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String portrait;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<Equipment> {
        public String name;
        public String portrait;

        public Builder() {
        }

        public Builder(Equipment equipment) {
            super(equipment);
            if (equipment == null) {
                return;
            }
            this.name = equipment.name;
            this.portrait = equipment.portrait;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Equipment build(boolean z) {
            return new Equipment(this, z);
        }
    }

    public Equipment(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.name;
            if (str == null) {
                this.name = "";
            } else {
                this.name = str;
            }
            String str2 = builder.portrait;
            if (str2 == null) {
                this.portrait = "";
                return;
            } else {
                this.portrait = str2;
                return;
            }
        }
        this.name = builder.name;
        this.portrait = builder.portrait;
    }
}
