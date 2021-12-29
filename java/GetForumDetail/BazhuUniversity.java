package tbclient.GetForumDetail;

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
import java.util.Collections;
import java.util.List;
/* loaded from: classes5.dex */
public final class BazhuUniversity extends Message {
    public static /* synthetic */ Interceptable $ic;
    public static final List<UniversityInfo> DEFAULT_BANNER;
    public static final List<UniversityInfo> DEFAULT_ENTRANCE;
    public static final List<UniversityTabInfo> DEFAULT_TAB;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<UniversityInfo> banner;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<UniversityInfo> entrance;
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<UniversityTabInfo> tab;

    /* loaded from: classes5.dex */
    public static final class Builder extends Message.Builder<BazhuUniversity> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public List<UniversityInfo> banner;
        public List<UniversityInfo> entrance;
        public List<UniversityTabInfo> tab;

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
        public Builder(BazhuUniversity bazhuUniversity) {
            super(bazhuUniversity);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {bazhuUniversity};
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
            if (bazhuUniversity == null) {
                return;
            }
            this.entrance = Message.copyOf(bazhuUniversity.entrance);
            this.banner = Message.copyOf(bazhuUniversity.banner);
            this.tab = Message.copyOf(bazhuUniversity.tab);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public BazhuUniversity build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new BazhuUniversity(this, z, null) : (BazhuUniversity) invokeZ.objValue;
        }
    }

    /* loaded from: classes5.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(99504110, "Ltbclient/GetForumDetail/BazhuUniversity;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(99504110, "Ltbclient/GetForumDetail/BazhuUniversity;");
                return;
            }
        }
        DEFAULT_ENTRANCE = Collections.emptyList();
        DEFAULT_BANNER = Collections.emptyList();
        DEFAULT_TAB = Collections.emptyList();
    }

    public /* synthetic */ BazhuUniversity(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BazhuUniversity(Builder builder, boolean z) {
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
            List<UniversityInfo> list = builder.entrance;
            if (list == null) {
                this.entrance = DEFAULT_ENTRANCE;
            } else {
                this.entrance = Message.immutableCopyOf(list);
            }
            List<UniversityInfo> list2 = builder.banner;
            if (list2 == null) {
                this.banner = DEFAULT_BANNER;
            } else {
                this.banner = Message.immutableCopyOf(list2);
            }
            List<UniversityTabInfo> list3 = builder.tab;
            if (list3 == null) {
                this.tab = DEFAULT_TAB;
                return;
            } else {
                this.tab = Message.immutableCopyOf(list3);
                return;
            }
        }
        this.entrance = Message.immutableCopyOf(builder.entrance);
        this.banner = Message.immutableCopyOf(builder.banner);
        this.tab = Message.immutableCopyOf(builder.tab);
    }
}
