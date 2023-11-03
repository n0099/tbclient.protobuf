package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class SortButton extends Message {
    public static final Integer DEFAULT_SOURCE_ID = 0;
    public static final String DEFAULT_TEXT = "";
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer source_id;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String text;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<SortButton> {
        public Integer source_id;
        public String text;

        public Builder() {
        }

        public Builder(SortButton sortButton) {
            super(sortButton);
            if (sortButton == null) {
                return;
            }
            this.text = sortButton.text;
            this.source_id = sortButton.source_id;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SortButton build(boolean z) {
            return new SortButton(this, z);
        }
    }

    public SortButton(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.text;
            if (str == null) {
                this.text = "";
            } else {
                this.text = str;
            }
            Integer num = builder.source_id;
            if (num == null) {
                this.source_id = DEFAULT_SOURCE_ID;
                return;
            } else {
                this.source_id = num;
                return;
            }
        }
        this.text = builder.text;
        this.source_id = builder.source_id;
    }
}
