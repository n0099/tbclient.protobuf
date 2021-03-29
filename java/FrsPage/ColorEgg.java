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

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<ColorEgg> {
        public List<String> holiday_words;
        public Integer style_flag;

        public Builder() {
        }

        public Builder(ColorEgg colorEgg) {
            super(colorEgg);
            if (colorEgg == null) {
                return;
            }
            this.holiday_words = Message.copyOf(colorEgg.holiday_words);
            this.style_flag = colorEgg.style_flag;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ColorEgg build(boolean z) {
            return new ColorEgg(this, z);
        }
    }

    public ColorEgg(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<String> list = builder.holiday_words;
            if (list == null) {
                this.holiday_words = DEFAULT_HOLIDAY_WORDS;
            } else {
                this.holiday_words = Message.immutableCopyOf(list);
            }
            Integer num = builder.style_flag;
            if (num == null) {
                this.style_flag = DEFAULT_STYLE_FLAG;
                return;
            } else {
                this.style_flag = num;
                return;
            }
        }
        this.holiday_words = Message.immutableCopyOf(builder.holiday_words);
        this.style_flag = builder.style_flag;
    }
}
