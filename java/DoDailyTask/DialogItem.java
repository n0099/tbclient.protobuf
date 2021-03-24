package tbclient.DoDailyTask;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class DialogItem extends Message {
    public static final List<ButtonItem> DEFAULT_BUTTON = Collections.emptyList();
    public static final String DEFAULT_CONTENT = "";
    public static final String DEFAULT_TITLE = "";
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<ButtonItem> button;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String content;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String title;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<DialogItem> {
        public List<ButtonItem> button;
        public String content;
        public String title;

        public Builder() {
        }

        public Builder(DialogItem dialogItem) {
            super(dialogItem);
            if (dialogItem == null) {
                return;
            }
            this.title = dialogItem.title;
            this.content = dialogItem.content;
            this.button = Message.copyOf(dialogItem.button);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DialogItem build(boolean z) {
            return new DialogItem(this, z);
        }
    }

    public DialogItem(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            String str2 = builder.content;
            if (str2 == null) {
                this.content = "";
            } else {
                this.content = str2;
            }
            List<ButtonItem> list = builder.button;
            if (list == null) {
                this.button = DEFAULT_BUTTON;
                return;
            } else {
                this.button = Message.immutableCopyOf(list);
                return;
            }
        }
        this.title = builder.title;
        this.content = builder.content;
        this.button = Message.immutableCopyOf(builder.button);
    }
}
