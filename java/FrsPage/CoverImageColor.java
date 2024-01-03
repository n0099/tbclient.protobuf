package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class CoverImageColor extends Message {
    public static final Integer DEFAULT_MODEL = 0;
    public static final String DEFAULT_VALUE = "";
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer model;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String value;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<CoverImageColor> {
        public Integer model;
        public String value;

        public Builder() {
        }

        public Builder(CoverImageColor coverImageColor) {
            super(coverImageColor);
            if (coverImageColor == null) {
                return;
            }
            this.value = coverImageColor.value;
            this.model = coverImageColor.model;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public CoverImageColor build(boolean z) {
            return new CoverImageColor(this, z);
        }
    }

    public CoverImageColor(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.value;
            if (str == null) {
                this.value = "";
            } else {
                this.value = str;
            }
            Integer num = builder.model;
            if (num == null) {
                this.model = DEFAULT_MODEL;
                return;
            } else {
                this.model = num;
                return;
            }
        }
        this.value = builder.value;
        this.model = builder.model;
    }
}
