package tbclient.Recommforum;

import com.baidu.android.imsdk.internal.Constants;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InitContext;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.baidu.titan.sdk.runtime.TitanRuntime;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class TestInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Integer DEFAULT_ANSWERED;
    public static final Integer DEFAULT_CREATE_TIME;
    public static final String DEFAULT_IMAGE_URL = "";
    public static final String DEFAULT_RESULT_IMG = "";
    public static final Long DEFAULT_TEST_ID;
    public static final String DEFAULT_TITLE = "";
    public transient /* synthetic */ FieldHolder $fh;
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

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<TestInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer answered;
        public Integer create_time;
        public String image_url;
        public RecommForum recomm_forum;
        public String result_img;
        public Long test_id;
        public String title;

        public Builder() {
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                interceptable.invokeUnInit(65536, newInitContext);
                int i2 = newInitContext.flag;
                if ((i2 & 1) != 0) {
                    int i3 = i2 & 2;
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65536, newInitContext);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(TestInfo testInfo) {
            super(testInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {testInfo};
                interceptable.invokeUnInit(65537, newInitContext);
                int i2 = newInitContext.flag;
                if ((i2 & 1) != 0) {
                    int i3 = i2 & 2;
                    super((Message) newInitContext.callArgs[0]);
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65537, newInitContext);
                    return;
                }
            }
            if (testInfo == null) {
                return;
            }
            this.test_id = testInfo.test_id;
            this.title = testInfo.title;
            this.image_url = testInfo.image_url;
            this.create_time = testInfo.create_time;
            this.answered = testInfo.answered;
            this.result_img = testInfo.result_img;
            this.recomm_forum = testInfo.recomm_forum;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TestInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new TestInfo(this, z, null) : (TestInfo) invokeZ.objValue;
        }
    }

    /* loaded from: classes10.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1624932348, "Ltbclient/Recommforum/TestInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1624932348, "Ltbclient/Recommforum/TestInfo;");
                return;
            }
        }
        DEFAULT_TEST_ID = 0L;
        DEFAULT_CREATE_TIME = 0;
        DEFAULT_ANSWERED = 0;
    }

    public /* synthetic */ TestInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TestInfo(Builder builder, boolean z) {
        super(builder);
        Interceptable interceptable = $ic;
        if (interceptable != null) {
            InitContext newInitContext = TitanRuntime.newInitContext();
            newInitContext.initArgs = r2;
            Object[] objArr = {builder, Boolean.valueOf(z)};
            interceptable.invokeUnInit(65537, newInitContext);
            int i2 = newInitContext.flag;
            if ((i2 & 1) != 0) {
                int i3 = i2 & 2;
                super((Message.Builder) newInitContext.callArgs[0]);
                newInitContext.thisArg = this;
                interceptable.invokeInitBody(65537, newInitContext);
                return;
            }
        }
        if (z) {
            Long l = builder.test_id;
            if (l == null) {
                this.test_id = DEFAULT_TEST_ID;
            } else {
                this.test_id = l;
            }
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            String str2 = builder.image_url;
            if (str2 == null) {
                this.image_url = "";
            } else {
                this.image_url = str2;
            }
            Integer num = builder.create_time;
            if (num == null) {
                this.create_time = DEFAULT_CREATE_TIME;
            } else {
                this.create_time = num;
            }
            Integer num2 = builder.answered;
            if (num2 == null) {
                this.answered = DEFAULT_ANSWERED;
            } else {
                this.answered = num2;
            }
            String str3 = builder.result_img;
            if (str3 == null) {
                this.result_img = "";
            } else {
                this.result_img = str3;
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
}
