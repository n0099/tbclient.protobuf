package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes7.dex */
public final class ColorEgg extends Message {
    public static final List<String> DEFAULT_HOLIDAY_WORDS = Collections.emptyList();
    public static final Integer DEFAULT_STYLE_FLAG = 0;
    @ProtoField(label = Message.Label.REPEATED, tag = 1, type = Message.Datatype.STRING)
    public final List<String> holiday_words;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer style_flag;

    private ColorEgg(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.holiday_words == null) {
                this.holiday_words = DEFAULT_HOLIDAY_WORDS;
            } else {
                this.holiday_words = immutableCopyOf(builder.holiday_words);
            }
            if (builder.style_flag == null) {
                this.style_flag = DEFAULT_STYLE_FLAG;
                return;
            } else {
                this.style_flag = builder.style_flag;
                return;
            }
        }
        this.holiday_words = immutableCopyOf(builder.holiday_words);
        this.style_flag = builder.style_flag;
    }

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<ColorEgg> {
        public List<String> holiday_words;
        public Integer style_flag;

        public Builder() {
        }

        public Builder(ColorEgg colorEgg) {
            super(colorEgg);
            if (colorEgg != null) {
                this.holiday_words = ColorEgg.copyOf(colorEgg.holiday_words);
                this.style_flag = colorEgg.style_flag;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ColorEgg build(boolean z) {
            return new ColorEgg(this, z);
        }
    }
}
