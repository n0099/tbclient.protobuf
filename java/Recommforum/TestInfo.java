package tbclient.Recommforum;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes7.dex */
public final class TestInfo extends Message {
    public static final String DEFAULT_IMAGE_URL = "";
    public static final String DEFAULT_RESULT_IMG = "";
    public static final String DEFAULT_TITLE = "";
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer answered;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer create_time;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String image_url;
    @ProtoField(tag = 9)
    public final RecommForum recomm_forum;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String result_img;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long test_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String title;
    public static final Long DEFAULT_TEST_ID = 0L;
    public static final Integer DEFAULT_CREATE_TIME = 0;
    public static final Integer DEFAULT_ANSWERED = 0;

    private TestInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.test_id == null) {
                this.test_id = DEFAULT_TEST_ID;
            } else {
                this.test_id = builder.test_id;
            }
            if (builder.title == null) {
                this.title = "";
            } else {
                this.title = builder.title;
            }
            if (builder.image_url == null) {
                this.image_url = "";
            } else {
                this.image_url = builder.image_url;
            }
            if (builder.create_time == null) {
                this.create_time = DEFAULT_CREATE_TIME;
            } else {
                this.create_time = builder.create_time;
            }
            if (builder.answered == null) {
                this.answered = DEFAULT_ANSWERED;
            } else {
                this.answered = builder.answered;
            }
            if (builder.result_img == null) {
                this.result_img = "";
            } else {
                this.result_img = builder.result_img;
            }
            this.recomm_forum = builder.recomm_forum;
            return;
        }
        this.test_id = builder.test_id;
        this.title = builder.title;
        this.image_url = builder.image_url;
        this.create_time = builder.create_time;
        this.answered = builder.answered;
        this.result_img = builder.result_img;
        this.recomm_forum = builder.recomm_forum;
    }

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<TestInfo> {
        public Integer answered;
        public Integer create_time;
        public String image_url;
        public RecommForum recomm_forum;
        public String result_img;
        public Long test_id;
        public String title;

        public Builder() {
        }

        public Builder(TestInfo testInfo) {
            super(testInfo);
            if (testInfo != null) {
                this.test_id = testInfo.test_id;
                this.title = testInfo.title;
                this.image_url = testInfo.image_url;
                this.create_time = testInfo.create_time;
                this.answered = testInfo.answered;
                this.result_img = testInfo.result_img;
                this.recomm_forum = testInfo.recomm_forum;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TestInfo build(boolean z) {
            return new TestInfo(this, z);
        }
    }
}
