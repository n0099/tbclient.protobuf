package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class FullLengthNovel extends Message {
    public static final Integer DEFAULT_BUTTON_HEIGH = 0;
    public static final String DEFAULT_HAS_TRUNCATE = "";
    public static final String DEFAULT_SCHEMA = "";
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer button_heigh;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String has_truncate;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String schema;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<FullLengthNovel> {
        public Integer button_heigh;
        public String has_truncate;
        public String schema;

        public Builder() {
        }

        public Builder(FullLengthNovel fullLengthNovel) {
            super(fullLengthNovel);
            if (fullLengthNovel == null) {
                return;
            }
            this.schema = fullLengthNovel.schema;
            this.has_truncate = fullLengthNovel.has_truncate;
            this.button_heigh = fullLengthNovel.button_heigh;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FullLengthNovel build(boolean z) {
            return new FullLengthNovel(this, z);
        }
    }

    public FullLengthNovel(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.schema;
            if (str == null) {
                this.schema = "";
            } else {
                this.schema = str;
            }
            String str2 = builder.has_truncate;
            if (str2 == null) {
                this.has_truncate = "";
            } else {
                this.has_truncate = str2;
            }
            Integer num = builder.button_heigh;
            if (num == null) {
                this.button_heigh = DEFAULT_BUTTON_HEIGH;
                return;
            } else {
                this.button_heigh = num;
                return;
            }
        }
        this.schema = builder.schema;
        this.has_truncate = builder.has_truncate;
        this.button_heigh = builder.button_heigh;
    }
}
